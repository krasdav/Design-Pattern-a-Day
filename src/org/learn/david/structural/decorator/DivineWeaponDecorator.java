package org.learn.david.structural.decorator;

public class DivineWeaponDecorator extends BaseWeaponDecorator{
    public DivineWeaponDecorator(Weapon weapon) {
        super(weapon);
    }

    @Override
    public void draw(){
        super.draw();
        System.out.println("Weapon is Devine!");
    }
}
