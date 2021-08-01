package org.learn.david.structural.bridge.yesbridge.weapon;

import org.learn.david.structural.bridge.yesbridge.type.Type;

public class Sword implements Weapon{

    private final Type type;

    public Sword(Type type) {
        this.type = type;
    }

    @Override
    public void swing() {
        System.out.println("Sword swing");
        type.apply();
    }

    @Override
    public void weild() {
        System.out.println("Sword weild");
        type.onActivate();
    }

    @Override
    public void unwield() {
        System.out.println("Sword unweild");
        type.onDeactivate();
    }

    @Override
    public Type getType() {
        return this.type;
    }
}
