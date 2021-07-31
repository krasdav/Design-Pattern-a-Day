package org.learn.david.creational.AbstractFactory.factories;

import org.learn.david.creational.AbstractFactory.cars.Car;
import org.learn.david.creational.AbstractFactory.cars.EcoCar;
import org.learn.david.creational.AbstractFactory.trucks.EcoTruck;
import org.learn.david.creational.AbstractFactory.trucks.Truck;

public class EcoFactory implements VehicleFactory {
    @Override
    public Truck createTruck() {
        return new EcoTruck() {
        };
    }

    @Override
    public Car createCar() {
        return new EcoCar();
    }
}
