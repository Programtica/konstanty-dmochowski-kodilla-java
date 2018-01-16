package com.kodilla.testing.collection;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

public class CollectionTestSuite
{
        @Before
        public void before()
        {
            System.out.println("Test case: begin");
        }

        @After
        public void after()
        {
            System.out.println("Test case: after");
        }

        @Test
        public void testOddNumbersExterminatorEmptyList()
        {
            //Given
            ArrayList<Integer> emptyList = new ArrayList<Integer>();
            //When
            ArrayList<Integer> result = OddNumbersExterminator.exterminate(emptyList);
            //Then
            Assert.assertEquals(0, result.size());
            System.out.println("Empty list? - It's OK!");
        }

        @Test
        public void testOddNumbersExterminatorNormalList()
        {
            //Given
            ArrayList<Integer> normalList = OddNumbersExterminator.addNumbersToTheList();
            //When
            ArrayList<Integer> result = OddNumbersExterminator.exterminate(normalList);
            //Then
            Assert.assertEquals(3, result.size());
            System.out.println("Full list? - It's OK!");
        }
    }
