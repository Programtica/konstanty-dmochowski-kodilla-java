package com.kodilla.patterns.prototype.library;

import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;

public class LibraryTestSuite {
    @Test
    public void testGetBooks() {
        //Given
        Library library = new Library("Helion - English");
        library.getBooks().add(new Book("Symphony C++ Standard", "Jerzy Grębosz", LocalDate.of(2010, 6, 30)));
        library.getBooks().add(new Book("Head First Java", "Kathy Sierra", LocalDate.of(2013, 11, 9)));
        library.getBooks().add(new Book("C++ Primer Plus", "Stephen Prata", LocalDate.of(2011, 9, 19)));
        library.getBooks().add(new Book("Thinking in Java", "Bruce Eckel", LocalDate.of(2015, 2, 22)));

        Library shallowCopy = null;
        try {
            shallowCopy = library.shallowCopy();
            shallowCopy.setName("Helion - Polish");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        Library deepCopy = null;
        try {
            deepCopy = library.deepCopy();
            deepCopy.setName("Helion - Polish");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        //When
        library.getBooks().add(new Book("Wprowadzenie do algorytmow","Thomas H. Cormen", LocalDate.of(2011, 3, 22)));

        //Then
        System.out.println(library);
        System.out.println(shallowCopy);
        System.out.println(deepCopy);
        Assert.assertEquals(5, library.getBooks().size());
        Assert.assertEquals(5, deepCopy.getBooks().size());
        Assert.assertEquals(4, deepCopy.getBooks().size());
    }
}
