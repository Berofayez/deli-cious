package com.pluralsight.ui;

import com.pluralsight.enums.BreadType;
import com.pluralsight.enums.SandwichSize;
import com.pluralsight.enums.SideType;
import com.pluralsight.enums.ToppingType;
import com.pluralsight.model.*;

public class AddSandwich {

    public static void display(Order order) {

        AddSandwich addSandwich = new AddSandwich();

        Sandwich sandwich = addSandwich.buildSandwich();

        order.addItem(sandwich);

        UserOutput.printSuccess("Sandwich added successfully!");

    }

    private Sandwich buildSandwich() {

        Sandwich sandwich = new Sandwich();

        BreadType bread = chooseBread();
        sandwich.setBreadType(bread);

        SandwichSize size = chooseSize();
        sandwich.setSandwichSize(size);

        addToppings(sandwich);

        boolean toasted = chooseToasted();
        sandwich.setToasted(toasted);

        chooseSide(sandwich);

        return sandwich;
    }

    private void chooseSide(Sandwich sandwich) {

        UserOutput.printSubHeader("Would you like a side?");

        UserOutput.printOptions(
                "Au Jus",
                "Sauce",
                "None"
        );

        int choice = UserInput.getValidInput(1, 3);

        switch (choice) {
            case 1 -> sandwich.setSide(SideType.AU_JUS);
            case 2 -> sandwich.setSide(SideType.SAUCE);
            case 3 -> sandwich.setSide(SideType.NONE);
        }
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

    private void addToppings(Sandwich sandwich) {

        askForMeat(sandwich);
        askForCheese(sandwich);
        askRegularToppings(sandwich);
        askSauces(sandwich);
    }

    private void askSauces(Sandwich sandwich) {

        UserOutput.printSubHeader("Do you want sauces?");

        while (true) {

            String input = UserInput.getStringInput().toLowerCase();

            switch (input) {

                case "yes":
                case "y":
                    showSauces(sandwich);
                    return;

                case "no":
                case "n":
                    return;

                default:
                    UserOutput.printError("Please enter yes or no.");
            }
        }
    }

    private void showSauces(Sandwich sandwich) {

        boolean adding = true;

        while (adding) {

            UserOutput.printSubHeader("Choose a sauce:");

            UserOutput.printOptions(
                    "mayo",
                    "mustard",
                    "ketchup",
                    "ranch",
                    "thousand islands",
                    "vinaigrette"
            );

            int choice = UserInput.getValidInput(1, 6);

            Topping topping = null;

            switch (choice) {

                case 1 -> topping = new Topping("mayo", ToppingType.SAUCE, false);
                case 2 -> topping = new Topping("mustard", ToppingType.SAUCE, false);
                case 3 -> topping = new Topping("ketchup", ToppingType.SAUCE, false);
                case 4 -> topping = new Topping("ranch", ToppingType.SAUCE, false);
                case 5 -> topping = new Topping("thousand islands", ToppingType.SAUCE, false);
                case 6 -> topping = new Topping("vinaigrette", ToppingType.SAUCE, false);

            }

            sandwich.addTopping(topping);

            UserOutput.printSubHeader("Add another sauce? (y/n)");

            adding = UserInput.getYesNo();
        }
    }

    private void askRegularToppings(Sandwich sandwich) {

        UserOutput.printSubHeader("Do you want regular toppings?");

        while (true) {

            String input = UserInput.getStringInput().toLowerCase();

            switch (input) {

                case "yes":
                case "y":
                    showRegularToppings(sandwich);
                    return;

                case "no":
                case "n":
                    return;

                default:
                    UserOutput.printError("Please enter yes or no.");
            }
        }
    }

    private void showRegularToppings(Sandwich sandwich) {

        boolean adding = true;

        while (adding) {

            UserOutput.printSubHeader("Choose a regular topping:");

            UserOutput.printOptions(
                    "lettuce",
                    "peppers",
                    "onions",
                    "tomatoes",
                    "jalapeños",
                    "cucumbers",
                    "pickles",
                    "guacamole",
                    "mushrooms"
            );

            int choice = UserInput.getValidInput(1, 9);

            Topping topping = null;

            switch (choice) {

                case 1 -> topping = new Topping("lettuce", ToppingType.REGULAR, false);
                case 2 -> topping = new Topping("peppers", ToppingType.REGULAR, false);
                case 3 -> topping = new Topping("onions", ToppingType.REGULAR, false);
                case 4 -> topping = new Topping("tomatoes", ToppingType.REGULAR, false);
                case 5 -> topping = new Topping("jalapeños", ToppingType.REGULAR, false);
                case 6 -> topping = new Topping("cucumbers", ToppingType.REGULAR, false);
                case 7 -> topping = new Topping("pickles", ToppingType.REGULAR, false);
                case 8 -> topping = new Topping("guacamole", ToppingType.REGULAR, false);
                case 9 -> topping = new Topping("mushrooms", ToppingType.REGULAR, false);

            }

            sandwich.addTopping(topping);

            UserOutput.printSubHeader("Add another regular topping? (y/n)");

            adding = UserInput.getYesNo();
        }
    }

    private void askForCheese(Sandwich sandwich) {
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

                    showCheeseOptions(sandwich);
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

    private void showCheeseOptions(Sandwich sandwich) {
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

            case 1 -> topping = new Topping("american", ToppingType.CHEESE, extra);
            case 2 -> topping = new Topping("provolone", ToppingType.CHEESE, extra);
            case 3 -> topping = new Topping("cheddar",ToppingType.CHEESE,extra);
            case 4 -> topping = new Topping("swiss", ToppingType.CHEESE, extra);
        }

        sandwich.addTopping(topping);
    }

    private void askForMeat(Sandwich sandwich) {

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

                    showMeatOptions(sandwich);
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

    private void showMeatOptions(Sandwich sandwich) {

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

            case 1 -> topping = new Topping("steak",ToppingType.MEAT,extra);
            case 2 -> topping = new Topping("ham",ToppingType.MEAT,extra);
            case 3 -> topping = new Topping("salami",ToppingType.MEAT,extra);
            case 4 -> topping = new Topping("roast beef",ToppingType.MEAT,extra);
            case 5 -> topping = new Topping("chicken",ToppingType.MEAT, extra);
            case 6 -> topping = new Topping("bacon", ToppingType.MEAT, extra);
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