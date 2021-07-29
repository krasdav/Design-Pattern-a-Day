package org.learn.david.AbstractFactory;

import org.learn.david.AbstractFactory.factories.DieselFactory;
import org.learn.david.AbstractFactory.factories.EcoFactory;
import org.learn.david.AbstractFactory.factories.VehicleFactory;

public class AbstractFactoryDemo {

    public static void main(String[] args) {
        Client client;
        VehicleFactory vehicleFactory;

        String plan = "Eco";

        if( plan.equals("Eco")){
            vehicleFactory = new EcoFactory();
        }else {
            vehicleFactory = new DieselFactory();
        }
        client = new Client(vehicleFactory);

        System.out.println(client.getCarDetails());
        System.out.println(client.getTruckDetails());

    }
}
