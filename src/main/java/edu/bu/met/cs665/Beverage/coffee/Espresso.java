/**
 * Name: Laya Dang
 * Course: CS-665 Software Designs & Patterns
 * Date: 10/06/2026
 * File Name: Espresso.java
 * Description: This is a class for methods and attributes of an Espresso.
 */

package edu.bu.met.cs665.beverage.coffee;

public class Espresso extends Coffee {

    /**
     * Initialize an Espresso with base cost.
     */
    public Espresso() {
        setCost(1.00);
    }

    /**
     * Gets Espresso string representation.
     * @see edu.bu.met.cs665.beverage.Beverage#getDescription()
     */
    @Override
    public String getDescription() {
        return "Espresso";
    }
}
