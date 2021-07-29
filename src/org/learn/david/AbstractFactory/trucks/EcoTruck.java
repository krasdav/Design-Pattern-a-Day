package org.learn.david.AbstractFactory.trucks;

public class EcoTruck implements Truck{
    @Override
    public String getEmissions() {
        return "notsomuch";
    }

    @Override
    public String getSpeed() {
        return "superslow";
    }
}
