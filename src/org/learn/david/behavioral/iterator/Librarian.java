package org.learn.david.behavioral.iterator;

import java.util.Iterator;

public class Librarian {

    BookIterator fantasyIterator;
    BookIterator scifiIterator;

    public Librarian(BookIterator fantasyIterator, BookIterator scifiIterator) {
        this.fantasyIterator = fantasyIterator;
        this.scifiIterator = scifiIterator;
    }

    public void showBooks(){
        Iterator<Book> fantasyBooks = fantasyIterator.createIterator();
        Iterator<Book> scifiBooks = scifiIterator.createIterator();

        System.out.println("Best Fantasy Books");
        printBooks(fantasyBooks);

        System.out.println("Best Sci-fi Books");
        printBooks(scifiBooks);
    }

    public void printBooks(Iterator<Book> iterator){
        while(iterator.hasNext()){
            Book book = iterator.next();
            System.out.println("---------------------------");
            System.out.println(book.getName());
            System.out.println(book.getAuthor());
            System.out.println(book.getYearOfRelease());
        }
    }
}
