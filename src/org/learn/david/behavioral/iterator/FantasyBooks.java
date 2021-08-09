package org.learn.david.behavioral.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class FantasyBooks implements BookIterator {
    private List<Book> bestFantasyBooks;

    public FantasyBooks() {
        bestFantasyBooks = new ArrayList<>();
        addBook("Mistborn, Final Empire",
                2006, "Brandon Sanderson");
        addBook("Mistborn, Well Of Ascension",
                2007, "Brandon Sanderson");
        addBook("Mistborn, Hero Of Ages",
                2008, "Brandon Sanderson");
    }

    public void addBook(String name, int yearOfRelease, String author) {
        bestFantasyBooks.add(new Book(name, yearOfRelease, author));
    }

    @Override
    public Iterator<Book> createIterator() {
        return bestFantasyBooks.iterator();
    }
}
