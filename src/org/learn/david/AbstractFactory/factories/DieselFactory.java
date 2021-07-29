package org.learn.david.AbstractFactory.factories;

import org.learn.david.AbstractFactory.cars.Car;
import org.learn.david.AbstractFactory.cars.DieselCar;
import org.learn.david.AbstractFactory.trucks.DieselTruck;
import org.learn.david.AbstractFactory.trucks.Truck;

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
