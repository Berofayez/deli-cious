package com.pluralsight.ui;

import com.pluralsight.model.BreadType;
import com.pluralsight.model.Order;
import com.pluralsight.model.Sandwich;
import com.pluralsight.model.SandwichSize;

public class AddSandwich {

    Sandwich sandwich;

    public static void display(Order order){

        AddSandwich addSandwich = new AddSandwich();

        Sandwich sandwich = addSandwich.buildSandwich();

        order.addItem(sandwich);

        UserOutput.printSuccess("Sandwich added successfully!");

    }
    private Sandwich buildSandwich(){

        BreadType bread = chooseBread();
        sandwich.setBreadType(bread);

        SandwichSize size = chooseSize();
        sandwich.setSandwichSize(size);

        addToppings();

        boolean toasted = chooseToasted();
        sandwich.setToasted(toasted);

        return sandwich;
    }

    private boolean chooseToasted() {

        UserOutput.printSubHeader(
                "Would you like your sandwich toasted?"
        );

        UserOutput.printDashOptions(
                "yes",
                "no"
        );

        while (true) {

            String input = UserInput
                    .getStringInput()
                    .toLowerCase();

            switch (input) {

                case "yes":
                case "y":
                    return true;

                case "no":
                case "n":
                    return false;

                default:
                    UserOutput.printError(
                            "Please enter yes or no."
                    );
            }
        }
    }

    private void addToppings() {

        UserOutput.printSubHeader(
                "Do you want meat?"
        );
    }

    private SandwichSize chooseSize() {

        UserOutput.printSubHeader(
                "Select sandwich size:"
        );

        UserOutput.printDashOptions(
                "4 inch",
                "8 inch",
                "12 inch"
        );

        while (true) {

            String input = UserInput
                    .getStringInput()
                    .toLowerCase();

            switch (input) {

                case "4":
                case "4 inch":
                    return SandwichSize.FOUR_INCH;

                case "8":
                case "8 inch":
                    return SandwichSize.EIGHT_INCH;

                case "12":
                case "12 inch":
                    return SandwichSize.TWELVE_INCH;

                default:
                    UserOutput.printError(
                            "Please select a valid size."
                    );
            }
        }
    }

    private BreadType chooseBread() {

        UserOutput.printSubHeader(
                "Select your bread:"
        );

        UserOutput.printDashOptions(
                "white",
                "wheat",
                "rye",
                "wrap"
        );

        while (true) {

            String input = UserInput
                    .getStringInput()
                    .toLowerCase();

            switch (input) {

                case "white":
                    return BreadType.WHITE;

                case "wheat":
                    return BreadType.WHEAT;

                case "rye":
                    return BreadType.RYE;

                case "wrap":
                    return BreadType.WRAP;

                default:
                    UserOutput.printError(
                            "Please select a valid bread type."
                    );
            }
        }
    }
}
