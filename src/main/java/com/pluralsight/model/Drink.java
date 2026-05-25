package com.pluralsight.model;

public class Drink implements MenuItem{
    private DrinkSize drinkSize;

    public Drink(DrinkSize drinkSize) {
        this.drinkSize = drinkSize;
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
}

