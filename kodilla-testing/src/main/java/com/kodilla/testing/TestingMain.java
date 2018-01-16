package com.kodilla.testing;

import com.kodilla.testing.calculator.Calculator;
import com.kodilla.testing.user.SimpleUser;

public class TestingMain
{
    public static void main(String[] args)
    {
        SimpleUser simpleUser = new SimpleUser("theForumUser", "John Smith");

        String result = simpleUser.getUsername();

        if (result.equals("theForumUser"))
        {
            System.out.println("test OK");
        }

        else
        {
            System.out.println("Error!");
        }

        // tu umieść kolejny test ->
        System.out.println("Test - pierwszy test jednostkowy:");

        Calculator calculator = new Calculator(-5,3);
        int resultFromAdd = calculator.add(-5,3);
        int resultFromSubtract = calculator.subtract(-5,3);

        if(resultFromAdd == -2)
        {
            System.out.println("Add: Everything from adding is OK!");
        }

        else
        {
            System.out.println("Add: Bad news!");
        }

        if(resultFromSubtract == 0)
        {
            System.out.println("Subtract: Everything from subtracting is OK!");
        }

        else
        {
            System.out.println("Subtract: Bad news!");
        }
    }
}