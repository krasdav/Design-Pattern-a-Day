package org.learn.david.behavioral.templatemethod;

public class TemplateMethodDemo {

    public static void main(String[] args) {
        PhoneManufacturer phoneManufacturer = new IphoneManufacturer();
        phoneManufacturer.manufacture("Iphone 6");
    }
}
