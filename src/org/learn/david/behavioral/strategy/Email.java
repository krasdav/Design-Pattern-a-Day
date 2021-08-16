package org.learn.david.behavioral.strategy;

public class Email implements Strategy{
    @Override
    public void send(String message) {
        System.out.println("Sending email with message: " + message );
    }
}
