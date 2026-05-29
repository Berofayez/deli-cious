package com.pluralsight.model;

import com.pluralsight.enums.BreadType;
import com.pluralsight.enums.SandwichSize;
import com.pluralsight.enums.ToppingType;

public class BLT extends Sandwich {

    public BLT() {
        setBreadType(BreadType.WHITE);
        setSandwichSize(SandwichSize.EIGHT_INCH);
        setToasted(true);

        addTopping(new Topping("Bacon", ToppingType.MEAT, false));
        addTopping(new Topping("Cheddar", ToppingType.CHEESE, false));
        addTopping(new Topping("Lettuce", ToppingType.REGULAR, false));
        addTopping(new Topping("Tomato", ToppingType.REGULAR, false));
        addTopping(new Topping("Ranch", ToppingType.SAUCE, false));
    }
}
