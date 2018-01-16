package com.kodilla.testing.collection;

import java.util.ArrayList;

class OddNumbersExterminator
{
    {
        ArrayList<Integer> numbers = addNumbersToTheList();
        exterminate(numbers);
    }

    public static ArrayList<Integer> addNumbersToTheList()
    {
        ArrayList<Integer> myList = new ArrayList<Integer>();

        myList.add(5);
        myList.add(10);
        myList.add(3);
        myList.add(1);
        myList.add(6);
        myList.add(4);

        return myList;
    }

    public static ArrayList<Integer> exterminate(ArrayList<Integer> numbers)
    {
        int temporary;
        ArrayList<Integer> evenNumbers = new ArrayList<Integer>();

        for (int i = 0; i < numbers.size(); i++) {
            temporary = numbers.get(i);

            if (temporary % 2 == 0) {
                evenNumbers.add(temporary);
            }
        }

        return evenNumbers;
    }
}
