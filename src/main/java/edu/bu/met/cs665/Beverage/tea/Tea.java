/**
 * Name: Laya Dang
 * Course: CS-665 Software Designs & Patterns
 * Date: 10/06/2026
 * File Name: Tea.java
 * Description: This is an abstract class for methods and attributes of a Tea.
 */

package edu.bu.met.cs665.beverage.tea;

import edu.bu.met.cs665.beverage.Beverage;

public abstract class Tea extends Beverage {

    /**
     * Prints tea steeping event.
     */
    public void steep() {
        System.out.println("Steeping tea...");
    }
}
