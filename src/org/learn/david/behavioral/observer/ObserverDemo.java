package org.learn.david.behavioral.observer;

public class ObserverDemo {

    public static void main(String[] args) {
        Store store = new Store();
        store.releaseEventManager.subscribe("Apple", new AppleCustomer("myappleemail_1"));
        store.releaseEventManager.subscribe("Apple", new AppleCustomer("myappleemail_2"));

        store.releaseEventManager.subscribe("Samsung", new SamsungCustomer("mysamsungemail_1"));

        store.releaseApple("IphoneX");
        store.releaseSamsung("Samsung10");

        store.releaseApple("IphoneGIGACHAD");

    }
}
