/**
 * Name: Laya Dang
 * Course: CS-665 Software Designs & Patterns
 * Date: 10/06/2026
 * File Name: GreenTea.java
 * Description: This is a class for methods and attributes of a Green Tea.
 */

package edu.bu.met.cs665.beverage.tea;

public class GreenTea extends Tea {

    /**
     * Initialize a GreenTea instance with base cost.
     */
    public GreenTea() {
        setCost(2.00);
    }

    /**
     * Gets GreenTea string representation.
     * @see edu.bu.met.cs665.beverage.Beverage#getDescription()
     */
    @Override
    public String getDescription() {
        return "Green Tea";
    }
}
