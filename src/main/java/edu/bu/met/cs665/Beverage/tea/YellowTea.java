/**
 * Name: Laya Dang
 * Course: CS-665 Software Designs & Patterns
 * Date: 10/06/2026
 * File Name: YellowTea.java
 * Description: This is a class for methods and attributes of a Yellow Tea.
 */

package edu.bu.met.cs665.beverage.tea;

public class YellowTea extends Tea {

    /**
     * Initialize a YellowTea instance with base cost.
     */
    public YellowTea() {
        setCost(2.00);
    }

    /**
     * Gets YellowTea string representation.
     * @see edu.bu.met.cs665.beverage.Beverage#getDescription()
     */
    @Override
    public String getDescription() {
        return "Yellow Tea";
    }
}
