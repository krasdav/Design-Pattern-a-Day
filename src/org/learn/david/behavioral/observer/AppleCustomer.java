package org.learn.david.behavioral.observer;

public class AppleCustomer implements Subscriber {
    private String email;

    public AppleCustomer(String email) {
        this.email = email;
    }

    @Override
    public void update(String product) {
        System.out.println("Apple Customer " + email + " - got notification about release of new product : " + product);
    }
}
