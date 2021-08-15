package org.learn.david.behavioral.state;

public class Laptop {
    private State currentState;

    public Laptop() {
        this.currentState = new Off();
    }

    void changeState(State state){
        currentState = state;
    }

    void powerButtonOnPress(){
        currentState.powerButtonOnPress(this);
    }
}
