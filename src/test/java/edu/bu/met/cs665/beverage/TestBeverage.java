package edu.bu.met.cs665.beverage;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import edu.bu.met.cs665.beverage.coffee.Americano;

public class TestBeverage {
    public TestBeverage() {}

    @Test
    public void testGetCostBaseSuccess() {
        Americano americano = new Americano();
        double expectedCost = 1.25;
        assertEquals(expectedCost, americano.getCost(), 0.001);
    }

    @Test
    public void testGetCostMilkSuccess() {
        Americano americano = new Americano();
        americano.setMilkLevel(3);
        double expectedCost = 2.75;
        assertEquals(expectedCost, americano.getCost(), 0.001);
    }

    @Test
    public void testSetCostSuccess() {
        Americano americano = new Americano();
        americano.setCost(100);
        double expectedCost = 100;
        assertEquals(expectedCost, americano.getCost(), 0.001);
    }

    @Test(expected=IllegalArgumentException.class)
    public void testSetCostFail() {
        Americano americano = new Americano();
        americano.setCost(-2222);
    }

    @Test
    public void testSetMilkLevelSuccess() {
        Americano americano = new Americano();
        americano.setMilkLevel(2);
        assertEquals(2, americano.getMilkLevel());
    }

    @Test(expected=IllegalArgumentException.class)
    public void testSetMilkLevelFail() {
        Americano americano = new Americano();
        americano.setMilkLevel(10);
    }

    @Test
    public void testSetSugarLevelSuccess() {
        Americano americano = new Americano();
        americano.setSugarLevel(2);
        assertEquals(2, americano.getSugarLevel());
    }

    @Test(expected=IllegalArgumentException.class)
    public void testSetSugarLevelFail() {
        Americano americano = new Americano();
        americano.setSugarLevel(10);
    }
}
