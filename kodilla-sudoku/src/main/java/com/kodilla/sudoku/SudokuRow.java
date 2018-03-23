package com.kodilla.sudoku;

import java.util.ArrayList;

public class SudokuRow {
    private ArrayList<SudokuElement> sudokuElement = new ArrayList<>();

    public SudokuRow() {
        for(int i=0; i<9; i++) {
            //sudokuElement.add(i, );
        }
    }

    public ArrayList<SudokuElement> getSudokuElement() {
        return sudokuElement;
    }
}
