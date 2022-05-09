package com.damianwasik.hashSet.books;

import java.util.Objects;

public class Books {

    String bookTitle;
    String bookAuthor;
    int theYearOfPublishment;

    public Books(String bookTitle, String bookAuthor, int theYearOfPublishment) {
        this.bookTitle = bookTitle;
        this.bookAuthor = bookAuthor;
        this.theYearOfPublishment = theYearOfPublishment;
    }

    public String getBookTitle() {
        return bookTitle;
    }

    public String getBookAuthor() {
        return bookAuthor;
    }

    public int getTheYearOfPublishment() {
        return theYearOfPublishment;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Books books = (Books) o;
        return theYearOfPublishment == books.theYearOfPublishment && Objects.equals(bookTitle, books.bookTitle) && Objects.equals(bookAuthor, books.bookAuthor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bookTitle, bookAuthor, theYearOfPublishment);
    }

    @Override
    public String toString() {
        return "Books{" +
                "bookTitle='" + bookTitle + '\'' +
                ", bookAuthor='" + bookAuthor + '\'' +
                ", theYearOfPublishment=" + theYearOfPublishment +
                '}';
    }
}
