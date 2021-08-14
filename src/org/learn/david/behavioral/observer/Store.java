package org.learn.david.behavioral.observer;

public class Store {
    public ReleaseEventManager releaseEventManager;

    public Store() {
        this.releaseEventManager = new ReleaseEventManager("Apple", "Samsung");
    }

    public void releaseApple(String product){
        System.out.println("Store - released new Apple product: " + product);
        releaseEventManager.notify("Apple",product);
    }

    public void releaseSamsung(String product){
        System.out.println("Store - release new Samsung product: " + product);
        releaseEventManager.notify("Samsung",product);
    }
}
