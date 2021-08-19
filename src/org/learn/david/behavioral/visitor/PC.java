package org.learn.david.behavioral.visitor;

import java.util.List;

public class PC implements PCPart{

    private List<PCPart> parts;

    public PC() {
        parts = List.of(new Mouse(),new Keyboard(), new Monitor());
    }

    @Override
    public void accept(PCPartVisitor pcPartVisitor) {
        for(PCPart part : parts){
            part.accept(pcPartVisitor);
        }
        pcPartVisitor.visit(this);
    }
}
