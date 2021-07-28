package org.learn.david.builder2;

public class Letter {
    private String header;
    private String paragraph;
    private String footer;

    public Letter(String header, String paragraph, String footer) {
        this.header = header;
        this.paragraph = paragraph;
        this.footer = footer;
    }

    @Override
    public String toString() {
        return header + paragraph + footer;
    }
}
