/**
 * Name: Laya Dang
 * Course: CS-665 Software Designs & Patterns
 * Date: 10/06/2026
 * File Name: Coffee.java
 * Description: This is an abstract class for methods and attributes of a Coffee.
 */

package edu.bu.met.cs665.beverage.coffee;

import edu.bu.met.cs665.beverage.Beverage;

public abstract class Coffee extends Beverage {

    /**
     * Prints coffee brewing event.
     */
    public void brew() {
        System.out.println("Brewing coffee...");
    }
}
