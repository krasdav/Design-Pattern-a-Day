package org.learn.david.structural.adapter;

import org.learn.david.structural.adapter.otherapp.Canned;

public class AdapterDemo {

    public static void main(String[] args) {
        System.out.println("Setup basket");
        Basket basket = new Basket();
        basket.addItem(new Fresh());
        basket.addItem(new Frozen());
        basket.addItem(new GreatItemObjectAdapter(new Canned()));
        basket.listItems();
    }
}
