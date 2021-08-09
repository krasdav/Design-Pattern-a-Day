package org.learn.david.behavioral.iterator;

import java.util.Iterator;
import java.util.List;

public class SciFiBooks implements BookIterator {
    Book[] bestSciFiBooks;
    int arrayFreeIndex = 0;

    public SciFiBooks() {
        bestSciFiBooks = new Book[3];
        addBook("Dune", 1965, "Frank Herbert");
        addBook("The Dispossessed", 1974, "Ursula K. Le Guin");
        addBook("Leviathan Wakes", 2011, "Daniel Abraham");
    }

    public void addBook(String name, int yearOfRelease, String author) {
        bestSciFiBooks[arrayFreeIndex] = new Book(name, yearOfRelease, author);
        arrayFreeIndex++;
    }

    @Override
    public Iterator<Book> createIterator() {
        return List.of(bestSciFiBooks).iterator();
    }
}
