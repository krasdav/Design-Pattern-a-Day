package org.learn.david.builder2;

public class LetterBuilder {
    private String header;
    private String paragraph;
    private String footer;

    public LetterBuilder setHeader(String header) {
        this.header = header;
        return this;
    }

    public LetterBuilder setParagraph(String paragraph) {
        this.paragraph = paragraph;
        return this;
    }

    public LetterBuilder setFooter(String footer) {
        this.footer = footer;
        return this;
    }

    public Letter build(){
        return new Letter(header,paragraph,footer);
    }
}
