package org.learn.david.behavioral.templatemethod;

public abstract class PhoneManufacturer {

    public PhoneManufacturer() {
    }

    public boolean manufacture(String design){
        createDesign(design);
        buyParts(design);
        assemble();
        return true;
    }

    public boolean buyParts(String design){
        System.out.println("Buying parts according to design: " + design);
        return true;
    }
    abstract boolean assemble();
    abstract boolean createDesign(String design);
}
