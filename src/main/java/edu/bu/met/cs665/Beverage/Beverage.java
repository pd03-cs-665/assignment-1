package edu.bu.met.cs665.Beverage;

public abstract class Beverage {
    private String description;
    private double cost;
    private double condimentCost = 0.5;

    private int milkLevel;
    private int sugarLevel;

    public String getDescription() {
        return this.description;
    }

    public double getCost() {
        return this.cost;
    }

    public int getMilkLevel() {
        return milkLevel;
    }

    public int getSugarLevel() {
        return sugarLevel;
    }

    public void updateCost(double price) {
        double newCost = this.cost + price;
        if (newCost < 0) {
            throw new IllegalArgumentException("Cost cannot be negative");
        }
        this.cost += price;
    }

    public void updateMilkLevel(int milkLevel) {
        if (milkLevel < 0 || milkLevel > 3 ) {
            throw new IllegalArgumentException("milkLevel needs to be between 0-3");
        }
        this.milkLevel = milkLevel;
        updateCost(this.condimentCost * milkLevel);
    }

    public void updateSugarLevel(int sugarLevel) {
        if (sugarLevel < 0 || sugarLevel > 3 ) {
            throw new IllegalArgumentException("sugarLevel needs to be between 0-3");
        }
        this.sugarLevel = sugarLevel;
    }
}
