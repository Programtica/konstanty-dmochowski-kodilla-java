package com.kodilla.exception.test;

import java.io.IOException;

public class FirstChallenge
{
    public double divide(double a, double b) throws ArithmeticException
    {
        if(b == 0)
        {
            throw new ArithmeticException();
        }

        return a / b;
    }

    /**
     * This main can throw an ArithmeticException!!!
     * @param args
     */
    public static void main(String[] args)
    {
        FirstChallenge myFirstChallenge = new FirstChallenge();

        try
        {
            double result = myFirstChallenge.divide(3, 0);
            System.out.println("Everything is OK!" + result);
        }

        catch(ArithmeticException a)
        {
            System.out.println("Oh, we can't divide by 0!");
        }

        finally
        {
            System.out.println("Hurray! We made an exceptions with dividing!");
        }
    }
}