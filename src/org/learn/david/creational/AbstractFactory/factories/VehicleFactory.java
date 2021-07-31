package org.learn.david.creational.AbstractFactory.factories;

import org.learn.david.creational.AbstractFactory.cars.Car;
import org.learn.david.creational.AbstractFactory.trucks.Truck;

public interface VehicleFactory {
    Truck createTruck();
    Car createCar();
}
