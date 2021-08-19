package org.learn.david.behavioral.visitor;

public interface PCPartVisitor {
    public void visit(Mouse mouse);
    public void visit(Keyboard keyboard);
    public void visit(Monitor monitor);
    public void visit(PC pc);
}
