package org.learn.david.behavioral.visitor;

public class Mouse implements PCPart{
    @Override
    public void accept(PCPartVisitor pcPartVisitor) {
        pcPartVisitor.visit(this);
    }
}
