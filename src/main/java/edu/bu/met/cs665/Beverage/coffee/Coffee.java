package edu.bu.met.cs665.beverage.coffee;

import edu.bu.met.cs665.beverage.Beverage;

public abstract class Coffee extends Beverage {

    public Coffee() {
        super();
    }

    public void brew() {
        System.out.println("Brewing coffee...");
    }
}
