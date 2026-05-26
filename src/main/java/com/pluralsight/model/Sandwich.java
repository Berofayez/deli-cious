package com.pluralsight.model;

import java.util.List;

public class Sandwich implements MenuItem{
    private SandwichSize sandwichSize;
    private BreadType breadType;
    private List<Topping> toppings;
    private boolean toasted;

    public Sandwich(SandwichSize sandwichSize, BreadType breadType, List<Topping> toppings, boolean toasted) {
        this.sandwichSize = sandwichSize;
        this.breadType = breadType;
        this.toppings = toppings;
        this.toasted = toasted;
    }

    public SandwichSize getSandwichSize() {
        return sandwichSize;
    }

    public BreadType getBreadType() {
        return breadType;
    }

    public List<Topping> getToppings() {
        return toppings;
    }

    public boolean isToasted() {
        return toasted;
    }

    public void setToasted(boolean toasted) {
        this.toasted = toasted;
    }

    public void addTopping(Topping topping) {
        this.toppings.add(topping);
    }

    @Override
    public double getPrice() {
        return PricingService.calculateSandwichPrice(this);
    }
}

