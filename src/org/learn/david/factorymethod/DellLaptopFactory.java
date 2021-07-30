package org.learn.david.factorymethod;

public class DellLaptopFactory implements LaptopFactory{
    @Override
    public Laptop createLaptop() {
        return new Dell();
    }
}
