package org.learn.david.structural.bridge.bridge.weapon;

import org.learn.david.structural.bridge.bridge.type.Type;

public interface Weapon {
    void swing();
    void weild();
    void unwield();
    Type getType();
}
