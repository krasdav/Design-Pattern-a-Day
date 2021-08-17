package org.learn.david.behavioral.templatemethod;

public class AndroidManufacturer extends PhoneManufacturer{
    private String brand = "Samsung";

    @Override
    boolean assemble() {
        System.out.println("Assembling Samsung");
        return true;
    }

    @Override
    boolean createDesign(String design) {
        System.out.println("Design for Samsung created: " + design );
        return true;
    }
}
