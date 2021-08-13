package org.learn.david.behavioral.memento;

public class Note {
    private String text;

    public void setText(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

    public Memento save(){
        System.out.println("Saving Note state...");
        return new Memento(this.text);
    }

    public void restore(Memento memento){
        this.text = memento.getText();
    }
}
