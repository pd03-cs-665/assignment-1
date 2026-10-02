package edu.bu.met.cs665.beverage;

public abstract class Beverage {
    private double cost;

    private static final double MILK_COST = 0.50;
    private static final double SUGAR_COST = 0.50;

    private int milkLevel;
    private int sugarLevel;

    public abstract String getDescription();

    public double getCost() {
        return this.cost + (MILK_COST * this.milkLevel) + (SUGAR_COST * this.sugarLevel);
    }

    public void setCost(double cost) {
        if (cost < 0) {
            throw new IllegalArgumentException("Cost cannot be negative");
        }
        this.cost = cost;
    }

    public int getMilkLevel() {
        return milkLevel;
    }

    public int getSugarLevel() {
        return sugarLevel;
    }

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
