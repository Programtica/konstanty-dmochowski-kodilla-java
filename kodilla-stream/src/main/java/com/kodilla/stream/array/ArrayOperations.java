package com.kodilla.stream.array;

import java.util.stream.IntStream;

interface ArrayOperations
{
    static double getAverage(int [] numbers)
    {
        IntStream.range(0, numbers.length)
                .forEach(System.out::print);

        double average = IntStream.range(0, numbers.length)
                .map(n -> numbers[n])
                .average().orElse(0);
        return average;

    }
}
