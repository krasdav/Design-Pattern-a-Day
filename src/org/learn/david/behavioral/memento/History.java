package org.learn.david.behavioral.memento;

import java.util.ArrayList;
import java.util.List;

public class History {
    private List<Memento> notesHistory = new ArrayList<>();

    public void addRecord(Memento memento){
        notesHistory.add(memento);
    }

    public Memento getLastRecord(){
        return notesHistory.get(0);
    }
}
