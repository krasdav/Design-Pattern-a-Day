package org.learn.david.behavioral.iterator;

public class Library {

    public static void main(String[] args) {
        FantasyBooks fantasyBooks = new FantasyBooks();
        SciFiBooks sciFiBooks = new SciFiBooks();

        Librarian librarian = new Librarian(fantasyBooks,sciFiBooks);

        librarian.showBooks();
    }
}
