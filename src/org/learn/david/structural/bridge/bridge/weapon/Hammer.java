package org.learn.david.structural.bridge.bridge.weapon;

import org.learn.david.structural.bridge.bridge.type.Type;

public class Hammer implements Weapon {

    private final Type type;

    public Hammer(Type type) {
        this.type = type;
    }

    @Override
    public void swing() {
        System.out.println("Swing Hammer");
        type.apply();
    }

    @Override
    public void weild() {
        System.out.println("Weild Hammer");
        type.onActivate();
    }

    @Override
    public void unwield() {
        System.out.println("Unweild Hammer");
        type.onDeactivate();
    }

    @Override
    public Type getType() {
        return this.type;
    }
}
