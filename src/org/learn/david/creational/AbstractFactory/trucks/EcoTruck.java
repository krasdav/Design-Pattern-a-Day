package org.learn.david.creational.AbstractFactory.trucks;

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
