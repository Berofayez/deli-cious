package com.pluralsight.model;

public enum ToppingType {
    MEAT(1.00, 2.00, 3.00),
    EXTRA_MEAT(.50, 1.00, 3.00),

    CHEESE(.75, 1.50, 2.25),
    EXTRA_CHEESE(.30, .60, .90),

    REGULAR(0, 0, 0),
    SAUCE(0, 0, 0),
    SIDE(0, 0, 0);

    private final double fourInchPrice;
    private final double eightInchPrice;
    private final double twelveInchPrice;


    ToppingType(double fourInchPrice, double eightInchPrice, double twelveInchPrice) {
        this.fourInchPrice = fourInchPrice;
        this.eightInchPrice = eightInchPrice;
        this.twelveInchPrice = twelveInchPrice;
    }

    public double getPrice(SandwichSize size){
        return switch (size){
            case FOUR_INCH -> fourInchPrice;
            case EIGHT_INCH -> eightInchPrice;
            case TWELVE_INCH -> twelveInchPrice;
        };
    }
}
