/**
 * Name: Laya Dang
 * Course: CS-665 Software Designs & Patterns
 * Date: 10/06/2026
 * File Name: Latte.java
 * Description: This is a class for methods and attributes of a Latte.
 */

package edu.bu.met.cs665.beverage.coffee;

public class Latte extends Coffee {

    /**
     * Initalize a Latte instance with base cost.
     */
    public Latte() {
        setCost(2.00);
    }

    /**
     * Gets Latte string representation.
     * @see edu.bu.met.cs665.beverage.Beverage#getDescription()
     */
    @Override
    public String getDescription() {
        return "Latte";
    }
}
