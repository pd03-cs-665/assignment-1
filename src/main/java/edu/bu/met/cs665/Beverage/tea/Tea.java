package edu.bu.met.cs665.beverage.tea;

import edu.bu.met.cs665.beverage.Beverage;

public abstract class Tea extends Beverage {

    public Tea() {
        super();
    }

    public void steep() {
        System.out.println("Steeping tea...");
    }
}
