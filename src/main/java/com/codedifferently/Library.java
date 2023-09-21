package com.codedifferently;

import java.util.ArrayList;

public class Library {
    public ArrayList<Book> displayBooks;
    private String userAccount;
    private Double payment;

    public Library(ArrayList<Book> displayBooks, String userAccount, Double payment) {
        this.displayBooks = displayBooks;
        this.userAccount = userAccount;
        this.payment = payment;
    }

    public void addBooks(Book book) {
        this.displayBooks.add(book);
    }
    public void displayBooks() {
        for (int i = 0; i < displayBooks.size(); i++) {
            Book currentBook = displayBooks.get(i);
            System.out.println(currentBook);
        }
    }

    public Integer inStock() {
        Integer numberOfBooks = displayBooks.size();
        return numberOfBooks;
    }

}