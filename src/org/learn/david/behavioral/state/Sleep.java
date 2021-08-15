package org.learn.david.behavioral.state;

public class Sleep implements State{

    @Override
    public void powerButtonOnPress(Laptop laptop) {
        System.out.println("Laptop state changed from SLEEP to OFF");
        laptop.changeState(new Off());
    }
}
