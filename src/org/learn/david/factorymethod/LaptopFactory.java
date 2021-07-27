package org.learn.david.factorymethod;

public class LaptopFactory {

    public Laptop createLaptop(String laptop) {
        if (laptop.equals("DELL")) {
            return new Dell();
        } else if (laptop.equals("LENOVO")) {
            return new Lenovo();
        }
        return null;
    }
}
