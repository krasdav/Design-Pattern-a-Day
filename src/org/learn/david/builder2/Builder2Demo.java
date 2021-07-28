package org.learn.david.builder2;

public class Builder2Demo {

    public static void main(String[] args) {
        Letter letter = new LetterBuilder().setHeader("Hi,\n").setParagraph("Just testing\n").setFooter("Builder pattern").build();
        System.out.println(letter);
    }
}
