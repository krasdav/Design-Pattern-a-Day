package org.learn.david.behavioral.observer;

public class SamsungCustomer implements Subscriber {

    private String email;

    public SamsungCustomer(String email) {
        this.email = email;
    }

    @Override
    public void update(String product) {
        System.out.println("Samsung Customer " + email + "- notified about release of new product: " + product);
    }
}
