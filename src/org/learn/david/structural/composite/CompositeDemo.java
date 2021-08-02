package org.learn.david.structural.composite;

import java.util.List;

public class CompositeDemo {

    public static void main(String[] args) {
        Component drive = new LeafComponent("HDD", 100);
        Component power = new LeafComponent("Power 660", 50);
        Component ram = new LeafComponent("RAM 4GB", 200);
        Component graphicCard = new LeafComponent("Graphic Card NVIDIA", 500);
        Component cpu = new LeafComponent("Processor Intel", 1000);
        Component mouse = new LeafComponent("Mouse Razor", 699);
        Component keyboard = new LeafComponent("Keyboard Logitech", 299);

        CompositeComponent pcCase = new CompositeComponent("Computer Case");
        CompositeComponent computer = new CompositeComponent("Computer");
        CompositeComponent motherboard = new CompositeComponent("Mother Board");
        CompositeComponent peri = new CompositeComponent("Peripheral");

        peri.addComponent(mouse);
        peri.addComponent(keyboard);

        pcCase.addComponent(List.of(motherboard,drive,power));
        motherboard.addComponent(List.of(cpu,graphicCard,ram));

        computer.addComponent(List.of(peri,pcCase,motherboard));

        motherboard.showPrice();
        System.out.println("----------------------------");
        cpu.showPrice();
        System.out.println("----------------------------");
        pcCase.showPrice();
        System.out.println("----------------------------");
        peri.showPrice();
        System.out.println("----------------------------");
        computer.showPrice();
    }
}
