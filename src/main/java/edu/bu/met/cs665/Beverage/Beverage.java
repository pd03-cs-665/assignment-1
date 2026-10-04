/**
 * Name: Laya Dang
 * Course: CS-665 Software Designs & Patterns
 * Date: 10/06/2026
 * File Name: Beverage.java
 * Description: This is an abstract class for methods and attributes of a Beverage.
 */

package edu.bu.met.cs665.beverage;

public abstract class Beverage {
    private double cost;

    private static final double MILK_COST = 0.50;
    private static final double SUGAR_COST = 0.50;

    private int milkLevel;
    private int sugarLevel;

    public abstract String getDescription();

    /**
     * Gets current beverage cost based on price and level of milk and sugar.
     * @return Current beverage cost.
     */
    public double getCost() {
        return this.cost + (MILK_COST * this.milkLevel) + (SUGAR_COST * this.sugarLevel);
    }

    /**
     * Sets beverage cost.
     * @param cost Cost to set beverage to.
     */
    public void setCost(double cost) {
        if (cost < 0) {
            throw new IllegalArgumentException("Cost cannot be negative");
        }
        this.cost = cost;
    }

    /**
     * Gets current beverage milk level.
     * @return Beverage milk level.
     */
    public int getMilkLevel() {
        return milkLevel;
    }

    /**
     * Gets current beverage sugar level.
     * @return Beverage sugar level.
     */
    public int getSugarLevel() {
        return sugarLevel;
    }

    /**
     * Sets beverage milk level between levels 0 to 3.
     * @param milkLevel  Milk level (0-3) to set.
     */
    public void setMilkLevel(int milkLevel) {
        if (milkLevel < 0 || milkLevel > 3) {
            throw new IllegalArgumentException("milkLevel needs to be between 0-3");
        }
        this.milkLevel = milkLevel;
    }

    /**
     * Sets beverage sugar level between levels 0 to 3.
     * @param sugarLevel  Sugar level (0-3) to set.
     */
    public void setSugarLevel(int sugarLevel) {
        if (sugarLevel < 0 || sugarLevel > 3) {
            throw new IllegalArgumentException("sugarLevel needs to be between 0-3");
        }
        this.sugarLevel = sugarLevel;
    }
}
