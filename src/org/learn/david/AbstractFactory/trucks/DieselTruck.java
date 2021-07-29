package org.learn.david.AbstractFactory.trucks;

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
