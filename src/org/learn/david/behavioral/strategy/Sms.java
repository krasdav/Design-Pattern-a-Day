package org.learn.david.behavioral.strategy;

public class Sms implements Strategy{
    @Override
    public void send(String message) {
        System.out.println("Sending sms with message: " + message);
    }
}
