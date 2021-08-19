package org.learn.david.behavioral.visitor;

public class Monitor implements PCPart{
    @Override
    public void accept(PCPartVisitor pcPartVisitor) {
        pcPartVisitor.visit(this);
    }
}
