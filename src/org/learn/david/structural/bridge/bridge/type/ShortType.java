package org.learn.david.structural.bridge.bridge.type;

public class ShortType implements Type{
    @Override
    public void onActivate() {
        System.out.println("Fast out");
    }

    @Override
    public void apply() {
        System.out.println("Hits easy");
    }

    @Override
    public void onDeactivate() {
        System.out.println("Fast to put back");
    }
}
