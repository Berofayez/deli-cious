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
        switch (drinkSize){
            case SMALL -> {
                return 2.00;
            }
            case MEDIUM -> {
                return 2.50;
            }
            case LARGE -> {
                return 3.00;
            }
            default -> {
                return 0;
            }

        }
    }
}

enum DrinkSize{
    SMALL,
    MEDIUM,
    LARGE
}
