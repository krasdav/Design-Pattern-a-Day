package org.learn.david.behavioral.state;

public class On implements State{
    @Override
    public void powerButtonOnPress(Laptop laptop) {
        System.out.println("Laptop state changed from ON to SLEEP");
        laptop.changeState(new Sleep());
    }
}
