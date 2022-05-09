package com.damianwasik.hashSet.books;

import java.util.HashSet;
import java.util.Set;

public class Application {

    public static void main(String[] args) {

        Books books1 = new Books("The book of iniciation1", "Damian Wąsik", 1991);
        Books books2 = new Books("The book of iniciation2", "Konrad Wąsik", 1999);
        Books books3 = new Books("The book of iniciation3", "Izabela Wąsik", 1889);
        Books books4 = new Books("The book of iniciation4", "Ewa Wąsik", 1997);
        Books books5 = new Books("The book of iniciation5", "Adam Wąsik", 1998);
        Books books6 = new Books("The book of iniciation6", "Aleksander Wąsik", 2001);
        Books books7 = new Books("The book of iniciation7", "Alojzy Wąsik", 2002);
        Books books8 = new Books("The book of iniciation8", "Genowefa Wąsik", 2002);
        Books books9 = new Books("The book of iniciation9", "Igor Wąsik", 2001);
        Books books10 = new Books("The book of iniciation10", "Alicja Wąsik", 1991);

        Set<Books> theListOfBooks = new HashSet<>();
        theListOfBooks.add(books1);
        theListOfBooks.add(books2);
        theListOfBooks.add(books3);
        theListOfBooks.add(books4);
        theListOfBooks.add(books5);
        theListOfBooks.add(books6);
        theListOfBooks.add(books7);
        theListOfBooks.add(books8);
        theListOfBooks.add(books9);
        theListOfBooks.add(books10);

        for (Books theAllNewListOfBooks : theListOfBooks) {
            if (theAllNewListOfBooks.getTheYearOfPublishment() >= 2000) {
                System.out.println(theAllNewListOfBooks);
            }
        }

    }

}
