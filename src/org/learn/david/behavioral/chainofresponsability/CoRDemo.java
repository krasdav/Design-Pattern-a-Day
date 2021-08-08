package org.learn.david.behavioral.chainofresponsability;

public class CoRDemo {

    public static void main(String[] args) {
        Processor processor = new NameProcessor();
        processor.linkWith(new SurnameProcessor());
        System.out.println("---1st user check---");
        processor.validate("Davi","Cupr");
        System.out.println("---2nd user check---");
        processor.validate("Bohdan","Veselovsky");
    }
}
