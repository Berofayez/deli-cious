package com.pluralsight.model;

public class Topping {
    private String name;
    private ToppingType category;

    public Topping(String name, ToppingType category) {
        this.name = name;
        this.category = category;
    }

    public String getName() {
        return name;
    }

    public ToppingType getCategory() {
        return category;
    }

    public double getPrice(SandwichSize size) {
        return category.getPrice(size);
    }
}


