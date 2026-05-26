package com.pluralsight.ui;

import java.util.Scanner;

public class UserInput {
    private final static Scanner scanner = new Scanner(System.in);

    public static String getStringInput(){
        return scanner.nextLine().trim();
    }

    public static int getIntInput(){
        return scanner.nextInt();
    }

    public static int getValidInput(int min, int max){
        while (true){
            int input = getIntInput();
            if(input >= min && input <= max){
                return input;
            }else {
                UserOutput.printError("your input is invalid pleas enter number between " + min + " and " + max);
            }
        }

    }

    public static double getDouble(){
        return scanner.nextDouble();
    }

    public static boolean getYesNo(){
        while (true){
            String input = scanner.nextLine().trim().toLowerCase();
            if(input.equals("y") || input.equals("yes")){
                return true;
            }
            if(input.equals("n") || input.equals("no")){
                return false;
            }
            UserOutput.printError("Invalid input enter y/n or yes/no ");
        }
    }
}
