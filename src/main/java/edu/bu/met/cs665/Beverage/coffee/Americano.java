/**
 * Name: Laya Dang
 * Course: CS-665 Software Designs & Patterns
 * Date: 10/06/2026
 * File Name: Americano.java
 * Description: This is a class for methods and attributes of an Americano.
 */

package edu.bu.met.cs665.beverage.coffee;

public class Americano extends Coffee {

    /**
     * Initialize an Americano instance with base cost.
     */
    public Americano() {
        setCost(1.25);
    }

    /**
     * Gets Americano string representation.
     * @see edu.bu.met.cs665.beverage.Beverage#getDescription()
     */
    @Override
    public String getDescription() {
        return "Americano";
    }
}
