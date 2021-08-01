package org.learn.david.structural.bridge.nobridge;

public class ShortHammer implements Weapon {
    @Override
    public void swing() {
        System.out.println("Swing with Short Hammer ");
    }

    @Override
    public void weild() {
        System.out.println("Weilding with Short Hammer");
    }

    @Override
    public void unwield() {
        System.out.println("Unweilding Short Hammer");
    }
}
