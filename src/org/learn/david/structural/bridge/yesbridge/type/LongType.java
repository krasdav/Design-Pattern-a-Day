package org.learn.david.structural.bridge.yesbridge.type;

public class LongType implements Type{

    @Override
    public void onActivate() {
        System.out.println("It takes time,to take out");
    }

    @Override
    public void apply() {
        System.out.println("Hits Hard");
    }

    @Override
    public void onDeactivate() {
        System.out.println("It take time, to put back");
    }
}
