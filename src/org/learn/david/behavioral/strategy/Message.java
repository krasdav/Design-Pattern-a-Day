package org.learn.david.behavioral.strategy;

public class Message {
    Strategy strategy;

    public Message(Strategy strategy) {
        this.strategy = strategy;
    }

    public void send(String message){
        strategy.send(message);
    }
}
