package org.learn.david.behavioral.mediator;

public interface Mediator {
    void turnOfFan();
    void turnOfPowerSupply();
    void turnOfPc();
    void setComponent(Component component);
}
