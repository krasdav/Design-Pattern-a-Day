package org.learn.david.structural.bridge.nobridge;

public class SoulEatingHammer implements Weapon{
    @Override
    public void swing() {
        System.out.println("Swing with soul eating Hammer ");
    }

    @Override
    public void weild() {
        System.out.println("Weilding with soul eating Hammer");
    }

    @Override
    public void unwield() {
        System.out.println("Unweilding soul eating Hammer");
    }
}
