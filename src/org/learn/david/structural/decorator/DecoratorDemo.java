package org.learn.david.structural.decorator;

public class DecoratorDemo {

    public static void main(String[] args) {
        Weapon sharpSword = new SharpWeaponDecorator(new Sword());
        sharpSword.draw();

        Weapon divineHammer = new DivineWeaponDecorator(new Hammer());
        divineHammer.draw();

        Weapon sharpDivineSword = new DivineWeaponDecorator(new SharpWeaponDecorator(new Sword()));
        sharpDivineSword.draw();
    }
}
