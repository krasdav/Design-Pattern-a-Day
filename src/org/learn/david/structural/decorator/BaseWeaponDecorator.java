package org.learn.david.structural.decorator;

public class BaseWeaponDecorator implements Weapon {
    private Weapon weapon;

    public BaseWeaponDecorator(Weapon weapon) {
        this.weapon = weapon;
    }

    @Override
    public void draw(){
        weapon.draw();
    }

}
