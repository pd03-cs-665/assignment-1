package edu.bu.met.cs665.Beverage;

public class Beverage {
    String description;
    double cost;
    int milkLevel;
    int sugarLevel;

    public void updateMilkLevel(int milkLevel) {
        if (milkLevel < 0 || milkLevel > 3 ) {
            throw new IllegalArgumentException("milkLevel needs to be between 0-3");
        }
        this.milkLevel = milkLevel;
    }

    public void updateSugarLevel(int sugarLevel) {
        if (sugarLevel < 0 || sugarLevel > 3 ) {
            throw new IllegalArgumentException("sugarLevel needs to be between 0-3");
        }
        this.sugarLevel = sugarLevel;
    }

}
