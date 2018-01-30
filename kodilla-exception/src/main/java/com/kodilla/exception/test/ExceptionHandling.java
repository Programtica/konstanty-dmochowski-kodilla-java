package com.kodilla.exception.test;

public class ExceptionHandling extends Exception {
    public static void main(String [] args) {
        SecondChallenge secondChallenge = new SecondChallenge();

        try {
            secondChallenge.probablyIWillThrowException(2,1.5);
        }

        catch (Exception e) {
            System.out.println("CATCH: Bad data! " + e);
        }

        finally {
            System.out.println("FINALLY: Finished exercise!");
        }
    }
}
