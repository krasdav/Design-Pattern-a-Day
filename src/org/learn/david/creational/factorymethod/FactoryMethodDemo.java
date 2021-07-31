package org.learn.david.creational.factorymethod;

public class FactoryMethodDemo {

    public static void main(String[] args) {
        LaptopFactory laptopFactory = new DellLaptopFactory();
        Laptop laptop = laptopFactory.createLaptop();
        //
        // bussines code with laptop
        //
        System.out.println(laptop);
    }
}
