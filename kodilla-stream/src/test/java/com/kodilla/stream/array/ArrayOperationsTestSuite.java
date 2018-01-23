package com.kodilla.stream.array;

import org.junit.Assert;
import org.junit.Test;

import java.util.Random;
import java.util.stream.IntStream;

public class ArrayOperationsTestSuite
{
    @Test
    public void testGetAverage()
    {
        //Given
        int[] numbers = new int[20];
        Random randomNumber = new Random();

        for(int i = 0; i<numbers.length;i++)
        {
            numbers[i] = randomNumber.nextInt(100);
        }

        //When
        double average = ArrayOperations.getAverage(numbers);
        double sum = IntStream.range(0, numbers.length)
                .map(n -> numbers[n])
                .sum();

        //Then
        System.out.println(average);
        Assert.assertEquals(sum/numbers.length, average, 0.01);
    }
}
