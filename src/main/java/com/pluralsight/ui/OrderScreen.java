package com.pluralsight.ui;

public class OrderScreen {
    public static void display(){
        UserOutput.printSubHeader("Select your order");
        UserOutput.printOrderOptions(
                " Add Sandwich",
                " Add Drink",
                " Add Chips",
                " Checkout",
                " Cancel Order");

        while (true){
            int input = UserInput.getValidInput(0, 4);

            switch (input){
                case 1:
                    AddSandwich.display();
                case 2:
                    AddDrink.display();
                case 3:
                    AddChips.display();
                case 4:
                    Checkout.display();
                case 0:
                    return;
            }
        }

    }
}
