package com.pluralsight.model;

import java.util.ArrayList;
import java.util.List;

public class Order {
    List<MenuItem> menuItems;

    public Order() {
        menuItems = new ArrayList<>();
    }

    public void addItem(MenuItem menuItem) {
        menuItems.add(menuItem);
    }

    public List<MenuItem> getMenuItems(){
        return menuItems;
    }

    public double getTotalPrice() {

        double total = 0;

        for (MenuItem item : menuItems) {
            total += item.getPrice();
        }

        return total;
    }
}
