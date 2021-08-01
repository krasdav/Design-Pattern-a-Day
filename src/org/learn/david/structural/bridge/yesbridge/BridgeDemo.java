package org.learn.david.structural.bridge.yesbridge;

import org.learn.david.structural.bridge.yesbridge.type.DivineType;
import org.learn.david.structural.bridge.yesbridge.type.ShortType;
import org.learn.david.structural.bridge.yesbridge.weapon.Hammer;
import org.learn.david.structural.bridge.yesbridge.weapon.Sword;

/*
    Same (as in nobridge) achieved with 7 classes, instead of 12. The more will be added the bigger impact there is.
    Types can be added without modyfing weapons and vice versa.
 */


public class BridgeDemo {

    public static void main(String[] args) {
        Sword shortSword = new Sword(new ShortType());
        shortSword.weild();
        shortSword.swing();
        shortSword.unwield();

        Hammer divineHammer = new Hammer(new DivineType());
        divineHammer.weild();
        divineHammer.swing();
        divineHammer.unwield();
    }
}
