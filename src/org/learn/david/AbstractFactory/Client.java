package org.learn.david.AbstractFactory;

import org.learn.david.AbstractFactory.cars.Car;
import org.learn.david.AbstractFactory.factories.VehicleFactory;
import org.learn.david.AbstractFactory.trucks.Truck;

public class Client {
    private Car car;
    private Truck truck;

    public Client(VehicleFactory factory){
        car = factory.createCar();
        truck = factory.createTruck();
    }

    public String getCarDetails(){
        return "Car speed: " + car.getSpeed() + " , Car emissions: " + car.getEmissions();
    }

    public String getTruckDetails(){
        return "Truck speed: " + truck.getSpeed() + " , Truck emissions: " + truck.getEmissions();
    }

}
