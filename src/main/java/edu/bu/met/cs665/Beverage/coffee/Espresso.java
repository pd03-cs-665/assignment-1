package edu.bu.met.cs665.beverage.coffee;

public class Espresso extends Coffee {
    public Espresso() {
        setCost(1.00);
    }
    @Override
    public String getDescription() {
        return "Espresso";
    }
}
