package org.learn.david.creational.factorymethod;

public class DellLaptopFactory implements LaptopFactory{
    @Override
    public Laptop createLaptop() {
        return new Dell();
    }
}
