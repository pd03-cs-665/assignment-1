package edu.bu.met.cs665.beverage.coffee;

public class Latte extends Coffee {

    public Latte() {
        setCost(2.00);
    }

    @Override
    public String getDescription() {
        return "Latte";
    }
}
