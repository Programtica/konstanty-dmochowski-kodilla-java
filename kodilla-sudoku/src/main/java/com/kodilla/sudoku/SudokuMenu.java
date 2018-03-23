package com.kodilla.sudoku;

import java.util.Scanner;

public class SudokuMenu {

    public String textOfMenu() {
        return "SUDOKU - game\n" +
        "To play this game, enter 3 numbers, where: \n" +
        "c - is a column, r - row, and v - value, \n" +
        " for example correct set can be: 227\n" +
        "Other options in our game: \n" +
        "SUDOKU - solve a game \n" +
        "n - starting new game \n" +
        "x - exit from the game";
    }

    public void makeAChoice() {
        System.out.println(textOfMenu());

        Scanner readingAnInput = new Scanner(System.in);
        System.out.println("\n");
        String choiceOfMenu = readingAnInput.next();

        switch(choiceOfMenu) {
            case "SUDOKU":
            case "sudoku":
                System.out.println("test");
                break;

            case "n":
                System.out.println("Do You want start a new game? [Y - yes, N - no]");
                choiceOfMenu = readingAnInput.next();

                if(choiceOfMenu.equals("Y") || choiceOfMenu.equals("y")) {
                    System.out.println("New");
                } else {

                }
                break;

            case "x":
                System.out.println("Do You want exit a game? [Y - yes, N - no]");
                choiceOfMenu = readingAnInput.next();

                if(choiceOfMenu.equals("Y") || choiceOfMenu.equals("y")) {
                    System.out.println("Exit");
                } else {

                }
                break;
        }
    }
}
