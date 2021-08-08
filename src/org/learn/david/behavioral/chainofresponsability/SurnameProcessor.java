package org.learn.david.behavioral.chainofresponsability;

public class SurnameProcessor extends Processor {
    @Override
    public boolean validate(String name, String surname) {
        if(surname.length() < 5){
            System.out.println("Use longer surname");
            return false;
        }
        System.out.println("Surname is fine");
        return checkNext(name,surname);
    }
}
