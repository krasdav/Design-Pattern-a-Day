package org.learn.david.structural.bridge.nobridge;

public class LongHammer implements Weapon{

    @Override
    public void swing() {
        System.out.println("Swing with Long Hammer ");
    }

    @Override
    public void weild() {
        System.out.println("Weilding with Long Hammer");
    }

    @Override
    public void unwield() {
        System.out.println("Unweilding Long Hammer");
    }
}
