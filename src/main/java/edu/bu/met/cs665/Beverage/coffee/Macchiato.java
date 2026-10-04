package edu.bu.met.cs665.beverage.coffee;

public class Macchiato extends Coffee {

    public Macchiato() {
        setCost(2.50);
    }

    @Override
    public String getDescription() {
        return "Macchiato";
    }
}
