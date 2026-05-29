package com.pluralsight.model;

import com.pluralsight.enums.BreadType;
import com.pluralsight.enums.SandwichSize;
import com.pluralsight.enums.ToppingType;

public class PhillyCheeseSteak extends Sandwich {

    public PhillyCheeseSteak() {

        setBreadType(BreadType.WHITE);
        setSandwichSize(SandwichSize.EIGHT_INCH);
        setToasted(true);

        addTopping(new Topping("Steak", ToppingType.MEAT, false));
        addTopping(new Topping("American", ToppingType.CHEESE, false));
        addTopping(new Topping("Peppers", ToppingType.REGULAR, false));
        addTopping(new Topping("Mayo", ToppingType.SAUCE, false));
    }
}
