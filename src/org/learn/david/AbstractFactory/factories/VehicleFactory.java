package org.learn.david.AbstractFactory.factories;

import org.learn.david.AbstractFactory.cars.Car;
import org.learn.david.AbstractFactory.trucks.Truck;

public interface VehicleFactory {
    Truck createTruck();
    Car createCar();
}
