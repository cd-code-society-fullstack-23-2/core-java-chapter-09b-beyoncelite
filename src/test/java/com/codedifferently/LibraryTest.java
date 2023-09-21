package com.codedifferently;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.ArrayList;
import java.util.List;

public class LibraryTest {

    private Library library;

    @BeforeEach
    public void setup() {
        ArrayList<Book> books = new ArrayList<>();
        library = new Library(books, "user123", 10.50);
    }

    @Test
    public void testAddBooks() {
        Book newBook = new Book("Hunger Games", 10.50);
        library.addBooks(newBook);

        assertEquals(1, library.inStock());
    }

    @Test
    public void testInStock() {
        Book book1 = new Book("Hunger Games", 10.50);
        Book book2 = new Book("Diary of a Wimpy Kid", 10.50);

        library.addBooks(book1);
        library.addBooks(book2);

        int result = library.inStock();

        assertEquals(2, result);
    }
}
