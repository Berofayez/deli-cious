package com.pluralsight.model;

public class Drink implements MenuItem{
    private DrinkSize drinkSize;
    private String flavor;

    public Drink(DrinkSize drinkSize, String flavor) {
        this.drinkSize = drinkSize;
        this.flavor = flavor;
    }

    public DrinkSize getDrinkSize() {
        return drinkSize;
    }

    public void setDrinkSize(DrinkSize drinkSize) {
        this.drinkSize = drinkSize;
    }

    @Override
    public double getPrice() {
        return switch (drinkSize){
            case SMALL ->  2.00;
            case MEDIUM -> 2.50;
            case LARGE ->  3.00;
        };
    }

    @Override
    public String toString() {
        return drinkSize + " " + flavor + " Drink ($" +
                String.format("%.2f", getPrice()) + ")";
    }
}

