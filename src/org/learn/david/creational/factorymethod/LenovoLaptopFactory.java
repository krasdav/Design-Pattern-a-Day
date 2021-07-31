package org.learn.david.creational.factorymethod;

public class LenovoLaptopFactory implements LaptopFactory{
    @Override
    public Laptop createLaptop() {
        return new Lenovo();
    }
}
