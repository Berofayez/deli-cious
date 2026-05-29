package com.pluralsight.ui;

import com.pluralsight.ui.constants.ColorCodes;

public class UserOutput {
    public static void printHeader(String message)
    {
        System.out.println(ColorCodes.YELLOW + "=".repeat(50) + ColorCodes.RESET);
        System.out.printf(ColorCodes.GREEN + "%30s%n", message);
        System.out.println(ColorCodes.YELLOW + "=".repeat(50) + ColorCodes.RESET);
    }

    public static void printSubHeader(String message){
        System.out.println(ColorCodes.CYAN + "\n" + message + ColorCodes.RESET);
    }

    public static void printHomeOrCheckoutOptions(String option1, String option0) {

        System.out.println(ColorCodes.GREEN + "1) " + ColorCodes.RESET + option1);
        System.out.println(ColorCodes.RED + "0) " + ColorCodes.RESET + option0);
    }

    public static void printOrderOptions(String option1, String option2, String option3,
                                         String option4, String option5, String option6,
                                         String option0) {

        System.out.println(ColorCodes.YELLOW + "\n=== ORDER MENU ===" + ColorCodes.RESET);

        System.out.println(ColorCodes.GREEN + "1) " + ColorCodes.RESET + option1);
        System.out.println(ColorCodes.GREEN + "2) " + ColorCodes.RESET + option2);
        System.out.println(ColorCodes.GREEN + "3) " + ColorCodes.RESET + option3);
        System.out.println(ColorCodes.GREEN + "4) " + ColorCodes.RESET + option4);
        System.out.println(ColorCodes.GREEN + "5) " + ColorCodes.RESET + option5);
        System.out.println(ColorCodes.GREEN + "6) " + ColorCodes.RESET + option6);

        System.out.println(ColorCodes.RED + "0) " + ColorCodes.RESET + option0);
    }

    public static void printOptions(String... options) {
        for (int i = 0; i < options.length; i++) {
            System.out.println(ColorCodes.BLUE + (i + 1) + ") " + ColorCodes.RESET + options[i]);
        }
    }

    public static void printDashOptions(String... options) {
        for (String option : options) {
            System.out.println(ColorCodes.PURPLE + "- " + ColorCodes.RESET + option);
        }
    }

    public static void printSeparator() {
        System.out.println(ColorCodes.YELLOW + "-".repeat(50) + ColorCodes.RESET);
    }

    public static void printError(String message) {
        System.out.println(ColorCodes.RED + message + ColorCodes.RESET);
    }

    public static void printSuccess(String message) {
        System.out.println(ColorCodes.GREEN + message + ColorCodes.RESET);
    }
}
