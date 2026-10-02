package edu.bu.met.cs665.beverage.coffee;

public class Americano extends Coffee {
    public Americano() {
        setCost(1.25);
    }
    @Override
    public String getDescription() {
        return "Americano";
    }
}
