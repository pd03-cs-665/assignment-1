/**
 * Name: Laya Dang
 * Course: CS-665 Software Designs & Patterns
 * Date: 10/06/2026
 * File Name: Macchiato.java
 * Description: This is a class for methods and attributes of a Macchiato.
 */

package edu.bu.met.cs665.beverage.coffee;

public class Macchiato extends Coffee {

    /**
     * Initalize a Macchiato instance with base cost.
     */
    public Macchiato() {
        setCost(2.50);
    }

    /**
     * Gets Macchiato string representation.
     * @see edu.bu.met.cs665.beverage.Beverage#getDescription()
     */
    @Override
    public String getDescription() {
        return "Macchiato";
    }
}
