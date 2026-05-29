package com.pluralsight.model;

import com.pluralsight.enums.ChipType;
import com.pluralsight.enums.DrinkSize;
import com.pluralsight.enums.SandwichSize;
import com.pluralsight.enums.ToppingType;
import com.pluralsight.service.PricingService;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PricingServiceTest {


    @Test
    void shouldCalculateFourInchMeatPrice() {

        Topping steak = new Topping(
                "steak",
                ToppingType.MEAT,
                false);

        double price = PricingService.calculateToppingPrice(
                steak,
                SandwichSize.FOUR_INCH);

        assertEquals(1.0, price);
    }

    @Test
    void shouldCalculateFourInchExtraMeatPrice() {

        Topping steak = new Topping(
                "steak",
                ToppingType.MEAT,
                true);

        double price = PricingService.calculateToppingPrice(
                steak,
                SandwichSize.FOUR_INCH);

        assertEquals(1.5, price);
    }

    @Test
    void shouldCalculateEightInchMeatPrice() {

        Topping steak = new Topping(
                "steak",
                ToppingType.MEAT,
                false);

        double price = PricingService.calculateToppingPrice(
                steak,
                SandwichSize.EIGHT_INCH);

        assertEquals(2.0, price);
    }

    @Test
    void shouldCalculateTwelveInchMeatPrice() {

        Topping steak = new Topping(
                "steak",
                ToppingType.MEAT,
                false);

        double price = PricingService.calculateToppingPrice(
                steak,
                SandwichSize.TWELVE_INCH);

        assertEquals(3.0, price);
    }

    @Test
    void shouldCalculateSandwichPrice() {

        Sandwich sandwich = new Sandwich();

        sandwich.setSandwichSize(
                SandwichSize.FOUR_INCH);

        sandwich.addTopping(
                new Topping(
                        "steak",
                        ToppingType.MEAT,
                        false));

        double price = sandwich.getPrice();

        assertEquals(6.50, price);
    }

    @Test
    void shouldCalculateDrinkLargePrice() {

        Drink drink = new Drink(DrinkSize.LARGE, "coke");

        double price = drink.getPrice();

        assertEquals(3.00, price);
    }

    @Test
    void shouldReturnChipPrice() {

        Chips chips = new Chips(
                ChipType.BBQ);

        assertEquals(1.50,
                chips.getPrice());
    }
}

