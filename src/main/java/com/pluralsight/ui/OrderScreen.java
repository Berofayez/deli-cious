package com.pluralsight.ui;

import com.pluralsight.model.BLT;
import com.pluralsight.model.Order;
import com.pluralsight.model.PhillyCheeseSteak;

public class OrderScreen {
    public static void display(){
        Order order = new Order();

        UserOutput.printSeparator();
        UserOutput.printSubHeader("Select your order");

        while (true){
            UserOutput.printOrderOptions(
                    " Custom Sandwich",
                    " BLT",
                    " Philly Cheese Steak",
                    " Add Drink",
                    " Add Chips",
                    " Checkout",
                    " Cancel Order");


            int input = UserInput.getValidInput(0, 6);
            UserOutput.printSeparator();

            switch(input){

                case 1 -> AddSandwich.display(order);

                case 2 -> order.addItem(new BLT());

                case 3 -> order.addItem(new PhillyCheeseSteak());

                case 4 -> AddDrink.display(order);

                case 5 -> AddChips.display(order);

                case 6 -> {
                    Checkout.display(order);
                    return;
                }

                case 0 -> {
                    return;
                }
            }
        }
    }
}
