package com.pluralsight.ui;

import com.pluralsight.ui.constants.ColorCodes;

public class UserOutput {
    public static void printHeader(String message)
    {
        System.out.println(ColorCodes.YELLOW + "*".repeat(55) + ColorCodes.RESET);
        System.out.println(ColorCodes.GREEN + message);
        System.out.println(ColorCodes.YELLOW + "*".repeat(55) + ColorCodes.RESET);
        System.out.println();
    }

    public static void printSubHeader(String message){
        System.out.println(message);
    }

    public static void printHomeOrCheckoutOptions(String option1, String option0){
        System.out.println("1)" + option1);
        System.out.println("0)" + option0);

    }

    public static void printOrderOptions(String option1, String option2, String option3, String option4, String option0){
        System.out.println("1)" + option1);
        System.out.println("2)" + option2);
        System.out.println("3)" + option3);
        System.out.println("4)" + option4);
        System.out.println("0)" + option0);

    }

    public static void addSandwichOption(String message){
        System.out.print(message + ":");

    }

    public static void addToppingOption(String message){
        System.out.print("\t" + message + ":");

    }

    public static void printOptions(String... options) {
        for (int i = 0; i < options.length; i++) {
            System.out.println(i + 1 + ") " + options[i]);
        }
    }

    public static void printDashOptions(String... options) {
        for (String option : options) {
            System.out.println("- " + option);
        }
    }

    public static void printSeparator() {
        System.out.println("-".repeat(44));
    }

    public static void printError(String message) {
        System.out.println(ColorCodes.RED + message + ColorCodes.RESET);
    }

    public static void printSuccess(String message) {
        System.out.println(ColorCodes.GREEN + message + ColorCodes.RESET);
    }
}
