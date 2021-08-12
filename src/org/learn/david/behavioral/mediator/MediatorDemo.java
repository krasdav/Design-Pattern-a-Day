package org.learn.david.behavioral.mediator;

public class MediatorDemo {

    public static void main(String[] args) {
        Mediator mediator = new PcMediator();
        mediator.setComponent(new Fan());
        mediator.setComponent(new PowerButton());
        mediator.setComponent(new PowerSupply());

        mediator.turnOfFan();
        mediator.turnOfPowerSupply();
        mediator.turnOfPc();
    }
}
