package org.learn.david.structural.bridge.nobridge;

public class LongSword implements Weapon {
    @Override
    public void swing(){
        System.out.println("Swing with Long Sword");
    }

    @Override
    public void weild(){
        System.out.println("Weilding Long Sword");
    }

    @Override
    public void unwield() {
        System.out.println("Unweilding Long Sword");
    }
}
