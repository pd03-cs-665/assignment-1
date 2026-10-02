package edu.bu.met.cs665.Beverage;

public abstract class Coffee extends Beverage {
    public Coffee() {
        super();
    }

    public void brew() {
        System.out.println("Brewing coffee...");
    }
}
