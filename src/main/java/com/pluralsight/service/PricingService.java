package com.pluralsight.service;

import com.pluralsight.model.Sandwich;
import com.pluralsight.enums.SandwichSize;
import com.pluralsight.model.Topping;

public class PricingService {
    public static double calculateSandwichPrice(Sandwich sandwich) {

        double totalPrice = getBaseSandwichPrice(
                sandwich.getSandwichSize()
        );

        for (Topping topping : sandwich.getToppings()) {

            totalPrice += calculateToppingPrice(
                    topping,
                    sandwich.getSandwichSize()
            );
        }

        return totalPrice;
    }

    public static double calculateToppingPrice(
            Topping topping,
            SandwichSize size
    ) {

        return switch (topping.getCategory()) {

            case MEAT ->
                    getMeatPrice(topping, size);

            case CHEESE ->
                    getCheesePrice(topping, size);

            default -> 0;
        };
    }

    private static double getBaseSandwichPrice(
            SandwichSize size
    ) {

        return switch (size) {

            case FOUR_INCH -> 5.50;

            case EIGHT_INCH -> 7.00;

            case TWELVE_INCH -> 8.50;
        };
    }

    private static double getMeatPrice(
            Topping topping,
            SandwichSize size
    ) {

        return switch (size) {

            case FOUR_INCH ->
                    topping.isExtra() ? 1.50 : 1.00;

            case EIGHT_INCH ->
                    topping.isExtra() ? 3.00 : 2.00;

            case TWELVE_INCH ->
                    topping.isExtra() ? 4.50 : 3.00;
        };
    }

    private static double getCheesePrice(
            Topping topping,
            SandwichSize size
    ) {

        return switch (size) {

            case FOUR_INCH ->
                    topping.isExtra() ? 1.05 : 0.75;

            case EIGHT_INCH ->
                    topping.isExtra() ? 2.10 : 1.50;

            case TWELVE_INCH ->
                    topping.isExtra() ? 3.15 : 2.25;
        };
    }
}
