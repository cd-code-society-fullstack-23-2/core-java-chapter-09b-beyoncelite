package com.codedifferently;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class BookTest {

    private Book book;
    @BeforeEach
    public void setUp() { book = new Book ("The Immortal Life of Henrietta Lacks", 12.00);}

    @Test
    public void constructorTest01(){
        String expected = "The Immortal Life of Henrietta Lacks, 12.00";
        String actual = book.toString();
        Assertions.assertEquals(expected, actual);
    }
}