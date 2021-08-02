package org.learn.david.structural.composite;

import java.util.ArrayList;
import java.util.List;

public class CompositeComponent implements Component{
    private List<Component> components = new ArrayList<>();
    private final String name;

    public CompositeComponent(String name) {
        this.name = name;
    }

    public void addComponent(Component com){
        components.add(com);
    }

    public void addComponent(List<Component> coms){
        components.addAll(coms);
    }

    @Override
    public void showPrice() {
        System.out.println(name);
        for(Component com : components){
            com.showPrice();
        }
    }
}
