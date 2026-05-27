package com.pluralsight.model;

public class Topping {
    private String name;
    private ToppingType category;
    private boolean extra;

    public Topping(String name, ToppingType category, boolean extra) {
        this.name = name;
        this.category = category;
        this.extra = extra;
    }

    public String getName() {
        return name;
    }

    public ToppingType getCategory() {
        return category;
    }

    public boolean isExtra() {
        return extra;
    }

    public void setExtra(boolean extra) {
        this.extra = extra;
    }
}


