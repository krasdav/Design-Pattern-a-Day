package org.learn.david.behavioral.command;

public class TV implements ElectronicDevice{
    @Override
    public void on() {
        System.out.println("TV is on");
    }

    @Override
    public void off() {
        System.out.println("TV is off");
    }
}
