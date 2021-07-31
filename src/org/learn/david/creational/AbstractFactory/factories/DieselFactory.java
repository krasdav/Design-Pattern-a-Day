package org.learn.david.creational.AbstractFactory.factories;

import org.learn.david.creational.AbstractFactory.cars.Car;
import org.learn.david.creational.AbstractFactory.cars.DieselCar;
import org.learn.david.creational.AbstractFactory.trucks.DieselTruck;
import org.learn.david.creational.AbstractFactory.trucks.Truck;

public class DieselFactory implements VehicleFactory {
    @Override
    public Truck createTruck() {
        return new DieselTruck();
    }

    @Override
    public Car createCar() {
        return new DieselCar();
    }
}
