package org.learn.david.factorymethod;

public class FactoryMethodDemo {

    public static void main(String[] args) {
        LaptopFactory laptopFactory = new LaptopFactory();

        Laptop laptop = laptopFactory.createLaptop("DELL");
        System.out.println(laptop.getPrice());

        laptop = laptopFactory.createLaptop("LENOVO");
        System.out.println(laptop.getPrice());
    }
}
