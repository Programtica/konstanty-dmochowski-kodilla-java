package com.kodilla.stream;

//import com.kodilla.stream.lambda.ExecuteSaySomething;
import com.kodilla.stream.beautifier.PoemBeautifier;
import com.kodilla.stream.iterate.NumbersGenerator;
//import com.kodilla.stream.lambda.Executor;
//import com.kodilla.stream.lambda.ExpressionExecutor;
//import com.kodilla.stream.lambda.Processor;
//import com.kodilla.stream.reference.FunctionalCalculator;
//import com.kodilla.stream.lambda.SaySomething;

public class StreamMain
{
    public static void main(String[] args)
    {
        System.out.println("Welcome to module 7 - Stream\n");

        //SaySomething saySomething = new SaySomething();
        //saySomething.say();

        /*Processor processor = new Processor();
        Executor codeToExecute = () -> System.out.println("This is an example text.");
        processor.execute(codeToExecute);
        ExecuteSaySomething executeSaySomething = new ExecuteSaySomething();
        processor.execute(executeSaySomething);

        Processor processor1 = new Processor();
        processor1.execute(()-> System.out.println("This is an example text."));

        ExpressionExecutor expressionExecutor = new ExpressionExecutor();

        System.out.println("Calculating expressions with lambdas");

        expressionExecutor.calculateExpression(10,5, (a,b) -> a+b);
        expressionExecutor.calculateExpression(10,5, (a,b) -> a-b);
        expressionExecutor.calculateExpression(10,5, (a,b) -> a*b);
        expressionExecutor.calculateExpression(10,5, (a,b) -> a/b);

        System.out.println("Calculating expressions with method references");
        expressionExecutor.calculateExpression(3,4, FunctionalCalculator::multiplyAByB);
        expressionExecutor.calculateExpression(3,4, FunctionalCalculator::addAToB);
        expressionExecutor.calculateExpression(3,4, FunctionalCalculator::subBFromA);
        expressionExecutor.calculateExpression(3,4, FunctionalCalculator::divideAByB);*/

        PoemBeautifier poemBeautifier = new PoemBeautifier();

        System.out.println("Text with decorations - examples: ");

        System.out.print("Upper case: ");
        poemBeautifier.beautify("Ala", (text) -> text.toUpperCase());

        System.out.print("Concatenation: ");
        poemBeautifier.beautify("Kostek", (text) -> text.concat("ABC"));

        System.out.print("Lower case: ");
        poemBeautifier.beautify("ŻÓŁW", (text) -> text.toLowerCase());

        System.out.print("Replace a letter: ");
        poemBeautifier.beautify("liść", (text) -> text.replace('ś','s'));

        System.out.println("Using Stream to generate even numbers from 1 to 20");
        NumbersGenerator.generateEven(20);
    }
}
