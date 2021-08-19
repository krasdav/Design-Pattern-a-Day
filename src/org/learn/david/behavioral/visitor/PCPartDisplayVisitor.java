package org.learn.david.behavioral.visitor;

public class PCPartDisplayVisitor implements PCPartVisitor{
    @Override
    public void visit(Mouse mouse) {
        System.out.println("Mouse");
    }

    @Override
    public void visit(Keyboard keyboard) {
        System.out.println("Keyboard");
    }

    @Override
    public void visit(Monitor monitor) {
        System.out.println("Monitor");
    }

    @Override
    public void visit(PC pc) {
        System.out.println("Computer");
    }
}
