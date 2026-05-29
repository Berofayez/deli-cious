package com.pluralsight.ui;

public class HomeScreen {

    public void display(){
        UserOutput.printHeader("Welcome to DELI-cious");

        boolean running = true;

        while (running){
            UserOutput.printSubHeader("choose 1 for new order 0 to exit");
            UserOutput.printHomeOrCheckoutOptions("New Order", "Exit");
            int input = UserInput.getValidInput(0, 1);
            switch (input) {
                case 1:
                    OrderScreen.display();
                    break;

                case 0:
                    UserOutput.printSubHeader("GoodBye!");
                    running = false;
                    break;
            }
        }

    }

}
