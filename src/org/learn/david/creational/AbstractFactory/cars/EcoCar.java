package org.learn.david.creational.AbstractFactory.cars;

public class EcoCar implements Car{

    @Override
    public String getEmissions() {
        return "zero";
    }

    @Override
    public String getSpeed() {
        return "slow";
    }
}
