package com.pluralsight.model;

public class Topping {
    private String name;
    private double price;
    private ToppingType category;
}

enum ToppingType {
    REGULAR,
    PREMIUM
}
