package org.learn.david.behavioral.chainofresponsability;

public abstract class Processor {
    private Processor next;

    public Processor linkWith(Processor next){
        this.next = next;
        return next;
    }

    public abstract boolean validate(String name, String surname);

    protected boolean checkNext(String name, String surname){
        if ( next == null){
            return true;
        }
        return next.validate(name,surname);
    }

}
