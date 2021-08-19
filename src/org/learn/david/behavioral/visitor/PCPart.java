package org.learn.david.behavioral.visitor;

public interface PCPart {
    void accept(PCPartVisitor pcPartVisitor);
}
