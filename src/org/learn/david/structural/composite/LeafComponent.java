package org.learn.david.structural.composite;

public class LeafComponent implements Component{

    private final String name;
    private int price;

    public LeafComponent(String name, int price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public void showPrice() {
        System.out.println(name + ": "+ price);
    }
}
