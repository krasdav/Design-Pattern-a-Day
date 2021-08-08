package org.learn.david.behavioral.chainofresponsability;

public class NameProcessor extends Processor {
    @Override
    public boolean validate(String name, String surname) {
        if(name.contains("B")){
            System.out.println("Do not use B in your name");
            return false;
        }
        System.out.println("Name is fine");
        return checkNext(name,surname);
    }
}
