package org.learn.david.AbstractFactory.factories;

import org.learn.david.AbstractFactory.cars.Car;
import org.learn.david.AbstractFactory.cars.EcoCar;
import org.learn.david.AbstractFactory.trucks.EcoTruck;
import org.learn.david.AbstractFactory.trucks.Truck;

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
