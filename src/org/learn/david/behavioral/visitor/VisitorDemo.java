package org.learn.david.behavioral.visitor;

public class VisitorDemo {

    public static void main(String[] args) {
        PCPart pc = new PC();
        pc.accept(new PCPartDisplayVisitor());
    }
}
