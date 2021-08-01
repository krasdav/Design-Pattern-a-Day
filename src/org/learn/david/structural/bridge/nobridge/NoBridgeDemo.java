package org.learn.david.structural.bridge.nobridge;

/*
    In case i want to add Devine weapon and one more weapon type
    I need to add 6 more classes:
    DevineHammer
    DevineSword

    DevineDagger
    SoulEatingDagger
    ShortDagger
    LongDagger

    I end up with 12 concrete classes

    Lets try with bridge
 */

public class NoBridgeDemo {

    public static void main(String[] args) {
        Weapon weapon = new SoulEatingHammer();
        weapon.swing();
        weapon.weild();

        weapon = new ShortHammer();
        weapon.swing();
    }
}
