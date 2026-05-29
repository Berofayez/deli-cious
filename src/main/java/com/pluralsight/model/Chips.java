package com.pluralsight.model;

import com.pluralsight.enums.ChipType;

public class Chips implements MenuItem{
    ChipType chipType;

    public Chips(ChipType chipType) {
        this.chipType = chipType;
    }

    public ChipType getChipType() {
        return chipType;
    }

    public void setChipType(ChipType chipType) {
        this.chipType = chipType;
    }

    @Override
    public double getPrice() {
        return 1.50;
    }

    @Override
    public String toString() {
        return chipType + " Chips ($" +
                String.format("%.2f", getPrice()) + ")";
    }
}
