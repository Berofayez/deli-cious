package com.pluralsight.ui;

import com.pluralsight.model.Drink;
import com.pluralsight.model.DrinkSize;
import com.pluralsight.model.Order;

public class AddDrink {

    public static void display(Order order) {

        DrinkSize size = chooseDrinkSize();

        String flavor = chooseFlavor();

        Drink drink = new Drink(size, flavor);

        order.addItem(drink);

        UserOutput.printSuccess("Drink added successfully!");
    }


    private static DrinkSize chooseDrinkSize() {

        UserOutput.printSubHeader("Choose drink size:");

        UserOutput.printOptions(
                "Small",
                "Medium",
                "Large"
        );

        int choice = UserInput.getValidInput(1, 3);

        return switch (choice) {

            case 1 -> DrinkSize.SMALL;
            case 2 -> DrinkSize.MEDIUM;
            case 3 -> DrinkSize.LARGE;

            default -> throw new IllegalStateException("Invalid drink size");
        };
    }

    private static String chooseFlavor() {

        UserOutput.printSubHeader("Choose drink flavor:");

        UserOutput.printOptions(
                "Coke",
                "Sprite",
                "Fanta",
                "Dr Pepper",
                "Lemonade",
                "Iced Tea"
        );

        int choice = UserInput.getValidInput(1, 6);

        return switch (choice) {

            case 1 -> "Coke";
            case 2 -> "Sprite";
            case 3 -> "Fanta";
            case 4 -> "Dr Pepper";
            case 5 -> "Lemonade";
            case 6 -> "Iced Tea";

            default -> throw new IllegalStateException("Invalid flavor");
        };
    }

}
