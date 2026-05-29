package com.pluralsight.model;

import com.pluralsight.enums.BreadType;
import com.pluralsight.enums.SandwichSize;
import com.pluralsight.enums.SideType;
import com.pluralsight.service.PricingService;

import java.util.ArrayList;
import java.util.List;

public class Sandwich implements MenuItem{
    private SandwichSize sandwichSize;
    private BreadType breadType;
    private List<Topping> toppings;
    private boolean toasted;
    private SideType side;

    public Sandwich(){
        this.toppings = new ArrayList<>();
    }

    public Sandwich(SandwichSize sandwichSize, BreadType breadType, List<Topping> toppings, boolean toasted, SideType side) {
        this.sandwichSize = sandwichSize;
        this.breadType = breadType;
        this.toppings = toppings;
        this.toasted = toasted;
        this.side = side;
    }

    public SandwichSize getSandwichSize() {
        return sandwichSize;
    }

    public void setSandwichSize(SandwichSize sandwichSize) {
        this.sandwichSize = sandwichSize;
    }

    public BreadType getBreadType() {
        return breadType;
    }

    public void setBreadType(BreadType breadType) {
        this.breadType = breadType;
    }

    public List<Topping> getToppings() {
        return toppings;
    }

    public void setToppings(List<Topping> toppings) {
        this.toppings = toppings;
    }

    public boolean isToasted() {
        return toasted;
    }

    public void setToasted(boolean toasted) {
        this.toasted = toasted;
    }

    public SideType getSide() {
        return side;
    }

    public void setSide(SideType side) {
        this.side = side;
    }

    public void addTopping(Topping topping) {
        this.toppings.add(topping);
    }

    @Override
    public double getPrice() {
        return PricingService.calculateSandwichPrice(this);
    }

    @Override
    public String toString() {

        StringBuilder sb = new StringBuilder();

        sb.append(sandwichSize)
                .append(" ")
                .append(breadType)
                .append(" Sandwich");

        if (toasted) {
            sb.append(" (Toasted)");
        }

        sb.append("\n");

        for (Topping topping : toppings) {
            sb.append("   - ")
                    .append(topping)
                    .append("\n");
        }

        if(side != SideType.NONE){
            sb.append("   Side: ")
                    .append(side)
                    .append("\n");
        }

        sb.append("   Price: $")
                .append(String.format("%.2f", getPrice()));

        return sb.toString();
    }
}

