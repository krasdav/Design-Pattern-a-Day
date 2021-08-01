package org.learn.david.structural.bridge.yesbridge.type;

public class DivineType implements Type{
    @Override
    public void onActivate() {
        System.out.println("Destroys everything around you closer than 5 meters");
    }

    @Override
    public void apply() {
        System.out.println("Cuts through the planet");
    }

    @Override
    public void onDeactivate() {
        System.out.println("You dont put it back, ever");
    }
}
