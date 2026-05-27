package com.pluralsight.ui;

import com.pluralsight.model.*;

import java.util.ArrayList;
import java.util.List;

public class AddSandwich {

    Sandwich sandwich;

    public static void display(Order order) {

        AddSandwich addSandwich = new AddSandwich();

        Sandwich sandwich = addSandwich.buildSandwich();

        order.addItem(sandwich);

        UserOutput.printSuccess("Sandwich added successfully!");

    }

    private Sandwich buildSandwich() {

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

        askForMeat();
        askForCheese();
    }

    private void askForCheese() {
        UserOutput.printSubHeader(
                "Do you want cheese?"
        );

        while (true) {

            String input = UserInput
                    .getStringInput()
                    .toLowerCase();

            switch (input) {

                case "yes":
                case "y":

                    showCheeseOptions();
                    return;

                case "no":
                case "n":

                    return;

                default:

                    UserOutput.printError(
                            "Please enter yes or no."
                    );
            }
        }
    }

    private void showCheeseOptions() {
        UserOutput.printSubHeader(
                "Choose cheese:"
        );

        UserOutput.printOptions(
                "american",
                "provolone",
                "cheddar",
                "swiss"
        );

        int input =
                UserInput.getValidInput(1, 4);

        UserOutput.printSubHeader(
                "Do you want extra cheese?"
        );

        boolean extra =
                UserInput.getYesNo();

        Topping topping = null;

        switch (input) {

            case 1 ->
                    topping = new Topping(
                            "american",
                            ToppingType.CHEESE,
                            extra
                    );

            case 2 ->
                    topping = new Topping(
                            "provolone",
                            ToppingType.CHEESE,
                            extra
                    );

            case 3 ->
                    topping = new Topping(
                            "cheddar",
                            ToppingType.CHEESE,
                            extra
                    );

            case 4 ->
                    topping = new Topping(
                            "swiss",
                            ToppingType.CHEESE,
                            extra
                    );
        }

        sandwich.addTopping(topping);
    }

    private void askForMeat () {

            UserOutput.printSubHeader(
                    "Do you want meat?"
            );

            while (true) {

                String input = UserInput
                        .getStringInput()
                        .toLowerCase();

                switch (input) {

                    case "yes":
                    case "y":

                        showMeatOptions();
                        return;

                    case "no":
                    case "n":

                        return;

                    default:

                        UserOutput.printError(
                                "Please enter yes or no."
                        );
                }
            }
        }

    private void showMeatOptions() {

        UserOutput.printSubHeader(
                "Choose meat:"
        );

        UserOutput.printOptions(
                "steak",
                "ham",
                "salami",
                "roast beef",
                "chicken",
                "bacon"
        );

        int input =
                UserInput.getValidInput(1, 6);

        UserOutput.printSubHeader(
                "Do you want extra meat?"
        );

        boolean extra =
                UserInput.getYesNo();

        Topping topping = null;

        switch (input) {

            case 1 ->
                    topping = new Topping(
                            "steak",
                            ToppingType.MEAT,
                            extra
                    );

            case 2 ->
                    topping = new Topping(
                            "ham",
                            ToppingType.MEAT,
                            extra
                    );

            case 3 ->
                    topping = new Topping(
                            "salami",
                            ToppingType.MEAT,
                            extra
                    );

            case 4 ->
                    topping = new Topping(
                            "roast beef",
                            ToppingType.MEAT,
                            extra
                    );

            case 5 ->
                    topping = new Topping(
                            "chicken",
                            ToppingType.MEAT,
                            extra
                    );

            case 6 ->
                    topping = new Topping(
                            "bacon",
                            ToppingType.MEAT,
                            extra
                    );
        }

        sandwich.addTopping(topping);
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