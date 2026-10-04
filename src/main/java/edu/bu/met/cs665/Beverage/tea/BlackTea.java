/**
 * Name: Laya Dang
 * Course: CS-665 Software Designs & Patterns
 * Date: 10/06/2026
 * File Name: BlackTea.java
 * Description: This is a class for methods and attributes of a Black Tea.
 */

package edu.bu.met.cs665.beverage.tea;

public class BlackTea extends Tea {

    /**
     * Initialize a BlackTea instance with base cost.
     */
    public BlackTea() {
        setCost(2.00);
    }

    /**
     * Gets BlackTea string representation.
     * @see edu.bu.met.cs665.beverage.Beverage#getDescription()
     */
    @Override
    public String getDescription() {
        return "Black Tea";
    }
}
