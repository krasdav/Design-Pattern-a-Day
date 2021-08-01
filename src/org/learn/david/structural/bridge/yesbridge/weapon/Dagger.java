package org.learn.david.structural.bridge.yesbridge.weapon;

import org.learn.david.structural.bridge.yesbridge.type.Type;

public class Dagger implements Weapon{
    private final Type type;

    public Dagger(Type type) {
        this.type = type;
    }

    @Override
    public void swing() {
        System.out.println("Swing Dagger");
        type.apply();
    }

    @Override
    public void weild() {
        System.out.println("Weild Dagger");
        type.onActivate();
    }

    @Override
    public void unwield() {
        System.out.println("Unweild Dagger");
        type.onDeactivate();
    }

    @Override
    public Type getType() {
        return this.type;
    }
}
