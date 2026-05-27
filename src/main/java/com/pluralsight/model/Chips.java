package com.pluralsight.model;

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
}
