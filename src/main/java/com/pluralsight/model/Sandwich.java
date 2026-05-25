package com.pluralsight.model;

public class Sandwich {
    private SandwichSize sandwichSize;
    private String breadType;
    private Topping topping;
    private boolean toasted;
    private double price;
}

enum SandwichSize{
    FOUR_INCH(4, 5.50),
    EIGHT_INCH(8, 7.00),
    TWELVE_INCH(12, 8.50);

    private final int inches;
    private final double basePrice;

    SandwichSize(int inches, double basePrice) {
        this.inches = inches;
        this.basePrice = basePrice;
    }

    public int getInches() {
        return inches;
    }

    public double getBasePrice() {
        return basePrice;
    }
}

