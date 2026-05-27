package com.pluralsight.model;

import java.util.List;

public class Order {
    List<MenuItem> menuItems;

    public void addItem(MenuItem menuItem) {
        menuItems.add(menuItem);
    }
}
