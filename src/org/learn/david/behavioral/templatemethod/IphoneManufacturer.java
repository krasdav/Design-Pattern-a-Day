package org.learn.david.behavioral.templatemethod;

public class IphoneManufacturer extends PhoneManufacturer{
    private String brand = "Apple";

    @Override
    boolean assemble() {
        System.out.println("Assembling Iphone");
        return true;
    }

    @Override
    boolean createDesign(String design) {
        System.out.println("Design for Iphone created: " + design);
        return true;
    }
}
