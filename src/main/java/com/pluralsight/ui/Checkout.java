package com.pluralsight.ui;

import com.pluralsight.model.MenuItem;
import com.pluralsight.model.Order;
import com.pluralsight.service.ReceiptService;

public class Checkout {
    public static void display(Order order) {

        UserOutput.printSeparator();
        System.out.println("ORDER SUMMARY");
        UserOutput.printSeparator();

        for (MenuItem item : order.getMenuItems()) {
            System.out.println(item);
        }



        double total = order.getTotalPrice();
        System.out.println("\nTOTAL: $" + total);

        UserOutput.printSeparator();

        UserOutput.printHomeOrCheckoutOptions("Confirm Order","Cancel Order");

        int choice = UserInput.getValidInput(0, 1);

        switch (choice) {

            case 1:
                ReceiptService.save(order);
                UserOutput.printSuccess("Order confirmed!");
                break;

            case 0:
                UserOutput.printSuccess("Order cancelled.");
                break;
        }

    }
}
