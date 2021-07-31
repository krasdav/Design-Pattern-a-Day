package org.learn.david.creational.AbstractFactory.trucks;

public class DieselTruck implements Truck{
    @Override
    public String getEmissions() {
        return "toomuch";
    }

    @Override
    public String getSpeed() {
        return "slow";
    }
}
