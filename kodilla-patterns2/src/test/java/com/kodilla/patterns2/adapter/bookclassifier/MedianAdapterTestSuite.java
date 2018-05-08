package com.kodilla.patterns2.adapter.bookclassifier;

import com.kodilla.patterns2.adapter.bookclasifier.MedianAdapter;
import com.kodilla.patterns2.adapter.bookclasifier.librarya.Book;
import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.assertEquals;

public class MedianAdapterTestSuite {
    @Test
    public void publicationYearMedianTest() {
        //Given
        Set<Book> books = new HashSet<>();
        books.add(new Book("Author1", "Title1", 2003, "1228282"));
        books.add(new Book("Author2", "Title2", 2005, "2948405"));
        books.add(new Book("Author3", "Title3", 2009, "1338384"));
        //When
        MedianAdapter medianAdapter = new MedianAdapter();
        int result = medianAdapter.publicationYearMedian(books);
        //Then
        assertEquals(2005, result);
        System.out.println("Publication Year Median: " + result);
    }
}
