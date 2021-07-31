package org.learn.david.structural.adapter;

import org.learn.david.structural.adapter.otherapp.GreatItem;

public class GreatItemObjectAdapter implements Item {

    private GreatItem adaptee;

    public GreatItemObjectAdapter(GreatItem adaptee) {
        this.adaptee = adaptee;
    }

    @Override
    public String getItemDescription() {
        return adaptee.getMyDescription();
    }
}
