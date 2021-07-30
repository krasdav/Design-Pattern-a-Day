package org.learn.david.factorymethod;

public class LenovoLaptopFactory implements LaptopFactory{
    @Override
    public Laptop createLaptop() {
        return new Lenovo();
    }
}
