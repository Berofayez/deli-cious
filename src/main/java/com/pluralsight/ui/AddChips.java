package com.pluralsight.ui;

import com.pluralsight.model.*;

public class AddChips {
    public static void display(Order order){

        UserOutput.printSubHeader("Do you want chips?");

        while (true) {

            String input = UserInput.getStringInput().toLowerCase();

            switch (input) {

                case "yes":
                case "y":
                    order.addItem(new Chips(showChipsType()));
                    return;

                case "no":
                case "n":
                    return;

                default:
                    UserOutput.printError("Please enter yes or no.");
            }
        }
    }

    private static ChipType showChipsType() {
        UserOutput.printSubHeader("Choose type:");

        UserOutput.printOptions(
                "BBQ",
                "sour cream",
                "salt & vinegar",
                "classic",
                "cheddar"
        );

        int choice = UserInput.getValidInput(1, 5);

        return switch (choice) {

            case 1 -> ChipType.BBQ;
            case 2 -> ChipType.SOUR_CREAM;
            case 3 -> ChipType.SALT_VINEGAR;
            case 4 -> ChipType.CLASSIC;
            case 5 -> ChipType.CHEDDAR;

            default -> throw new IllegalStateException("Invalid chip choice");

        };
    }
}
