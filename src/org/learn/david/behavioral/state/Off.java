package org.learn.david.behavioral.state;

public class Off implements State{

    @Override
    public void powerButtonOnPress(Laptop laptop) {
        System.out.println("Laptop state changed from OFF to ON");
        laptop.changeState(new On());
    }
}
