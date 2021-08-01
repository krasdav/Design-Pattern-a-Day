package org.learn.david.structural.bridge.yesbridge.weapon;

import org.learn.david.structural.bridge.yesbridge.type.Type;

public interface Weapon {
    void swing();
    void weild();
    void unwield();
    Type getType();
}
