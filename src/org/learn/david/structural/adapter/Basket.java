package org.learn.david.structural.adapter;

import java.util.ArrayList;
import java.util.List;

public class Basket {
    private List<Item> items = new ArrayList<>();

    public Basket() {
       super();
    }

    public void addItem(Item item){
        items.add(item);
    }

    public List<Item> getItems(){
        return items;
    }

    public void listItems(){
        items.forEach(item -> System.out.println(item.getItemDescription()));
    }
}
