package org.learn.david.structural.bridge.nobridge;

public class ShortSword implements Weapon{
    @Override
    public void swing(){
        System.out.println("Swing with Short Sword");
    }

    @Override
    public void weild(){
        System.out.println("Weilding Short Sword");
    }

    @Override
    public void unwield() {
        System.out.println("Unweilding Short Sword");
    }
}
