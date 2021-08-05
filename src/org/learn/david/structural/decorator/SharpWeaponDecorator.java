package org.learn.david.structural.decorator;

public class SharpWeaponDecorator extends BaseWeaponDecorator{

    public SharpWeaponDecorator(Weapon weapon) {
        super(weapon);
    }

    @Override
    public void draw(){
        super.draw();
        System.out.println("Weapon is sharp!");
    }
}
