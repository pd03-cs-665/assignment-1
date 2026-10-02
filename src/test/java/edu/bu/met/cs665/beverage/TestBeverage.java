package edu.bu.met.cs665.beverage;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestBeverage {
    public TestBeverage() {};

    private static class MockBeverage extends Beverage {
        public MockBeverage() {
            setCost(1200);
        }

        @Override
        public String getDescription() {
            return "Mock Beverage";
        }
    };

    @Test
    public void testGetCostBaseSuccess() {
        MockBeverage mockBeverage = new MockBeverage();
        double expectedCost = 1200;
        assertEquals(expectedCost, mockBeverage.getCost(), 0.001);
    }

    @Test
    public void testGetCostMilkSuccess() {
        MockBeverage mockBeverage = new MockBeverage();
        mockBeverage.setMilkLevel(3);
        double expectedCost = 1200 + (3*0.5);
        assertEquals(expectedCost, mockBeverage.getCost(), 0.001);
    }

    @Test
    public void testSetCostSuccess() {
        MockBeverage mockBeverage = new MockBeverage();
        mockBeverage.setCost(100);
        double expectedCost = 100;
        assertEquals(expectedCost, mockBeverage.getCost(), 0.001);
    }

    @Test(expected=IllegalArgumentException.class)
    public void testSetCostFail() {
        MockBeverage mockBeverage = new MockBeverage();
        mockBeverage.setCost(-2222);
    }

    @Test
    public void testSetMilkLevelSuccess() {
        MockBeverage mockBeverage = new MockBeverage();
        mockBeverage.setMilkLevel(2);
        assertEquals(2, mockBeverage.getMilkLevel());
    }

    @Test(expected=IllegalArgumentException.class)
    public void testSetMilkLevelFail() {
        MockBeverage mockBeverage = new MockBeverage();
        mockBeverage.setMilkLevel(10);
    }

    @Test
    public void testSetSugarLevelSuccess() {
        MockBeverage mockBeverage = new MockBeverage();
        mockBeverage.setSugarLevel(2);
        assertEquals(2, mockBeverage.getSugarLevel());
    }

    @Test(expected=IllegalArgumentException.class)
    public void testSetSugarLevelFail() {
        MockBeverage mockBeverage = new MockBeverage();
        mockBeverage.setSugarLevel(10);
    }
}
