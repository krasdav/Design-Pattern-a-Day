package org.learn.david.behavioral.iterator;

public class Book {
    private String name;
    private int yearOfRelease;
    private String author;

    public Book(String name, int yearOfRelease, String author) {
        this.name = name;
        this.yearOfRelease = yearOfRelease;
        this.author = author;
    }

    public String getName() {
        return name;
    }

    public int getYearOfRelease() {
        return yearOfRelease;
    }

    public String getAuthor() {
        return author;
    }
}
