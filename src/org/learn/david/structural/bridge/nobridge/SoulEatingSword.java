package org.learn.david.structural.bridge.nobridge;

public class SoulEatingSword implements Weapon{

    @Override
    public void swing(){
        System.out.println("Eat a soul with Sword");
    }

    @Override
    public void weild(){
        System.out.println("Weilding soul eating Sword");
    }

    @Override
    public void unwield() {
        System.out.println("Unweilding soul eating Sword");
    }

}
