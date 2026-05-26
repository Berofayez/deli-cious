package com.pluralsight.ui;

public class HomeScreen {

    public void display(){
        UserOutput.printHeader("Welcome to DELI-cious");
        UserOutput.printHomeOrCheckoutOptions("New Order", "Exit");

        boolean running = true;

        while (running){
            int input = UserInput.getValidInput(0, 1);
            switch (input){
                case 1:
                    OrderScreen.display();
                case 0:
                    UserOutput.printSubHeader("GoodBye!");
                    running = false;
            }
        }

    }

}
