package org.learn.david.structural.bridge.bridge.type;

public class SoulEatingType implements Type{

    @Override
    public void onActivate() {
        System.out.println("Black fog appeared");
    }

    @Override
    public void apply() {
        System.out.println("Eats your soul");
    }

    @Override
    public void onDeactivate() {
        System.out.println("Black fog disappears");
    }
}
