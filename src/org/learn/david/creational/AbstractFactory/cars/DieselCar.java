package org.learn.david.creational.AbstractFactory.cars;

public class DieselCar implements Car{
    @Override
    public String getEmissions() {
        return "alot";
    }

    @Override
    public String getSpeed() {
        return "toofast";
    }
}
