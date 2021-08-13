package org.learn.david.behavioral.memento;

public class DemoMemento {

    public static void main(String[] args) {
        History noteHistory = new History();
        Note note = new Note();
        note.setText("First Text");
        noteHistory.addRecord(note.save());
        System.out.println(note.getText());

        note.setText("Second Text");
        noteHistory.addRecord(note.save());
        System.out.println(note.getText());

        note.restore(noteHistory.getLastRecord());
        System.out.println("After reset:");
        System.out.println(note.getText());
    }
}
