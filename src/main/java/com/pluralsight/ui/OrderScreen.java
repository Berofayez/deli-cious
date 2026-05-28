package com.pluralsight.ui;

import com.pluralsight.model.Order;
import com.pluralsight.model.Sandwich;

public class OrderScreen {
    public static void display(){
        Order order = new Order();
        UserOutput.printSubHeader("Select your order");


        while (true){
            UserOutput.printOrderOptions(
                    " Add Sandwich",
                    " Add Drink",
                    " Add Chips",
                    " Checkout",
                    " Cancel Order");
            int input = UserInput.getValidInput(0, 4);

            switch(input){

                case 1 -> AddSandwich.display(order);

                case 2 -> AddDrink.display(order);

                case 3 -> AddChips.display(order);

                case 4 -> Checkout.display(order);

                case 0 -> {
                    return;
                }
            }
        }
    }
}
