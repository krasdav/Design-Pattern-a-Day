package org.learn.david.behavioral.command;

public class Radio implements ElectronicDevice{
    @Override
    public void on() {
        System.out.println("Radio is on");
    }

    @Override
    public void off() {
        System.out.println("Radio is off");
    }
}
