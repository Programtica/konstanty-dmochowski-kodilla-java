package com.kodilla.testing.shape;

import org.junit.*;

public class ShapeCollectorTestSuite
{
    private static int counter = 0;

    @BeforeClass
    public static void beforeAllTests()
    {
        System.out.println("This is beginning of all tests");
    }

    @AfterClass
    public static void afterAllTests()
    {
        System.out.println("This is the end of all tests");
    }

    @Before
    public void beforeEachTest()
    {
        counter++;
        System.out.println("Preparing to execute test #" + counter);
    }

    @Test
    public void testAddFigure()
    {
        //Given
        ShapeCollector shape = new ShapeCollector();
        Circle circle = new Circle(3.0);
        shape.addFigure(circle);
        //When
        Shape figure = shape.getFigure(0);
        //Then
        Assert.assertEquals(circle, figure);
    }

    @Test
    public void testRemoveFigure()
    {
        //Given
        ShapeCollector shape = new ShapeCollector();
        Square square = new Square(5.0);
        Triangle triangle = new Triangle(2.0, 3.0);
        //When
        shape.addFigure(square);
        shape.addFigure(triangle);
        shape.removeFigure(square);
        int sizeOfList = shape.shapes.size();
        //Then
        Assert.assertEquals(1, sizeOfList);
    }

    @Test
    public void testGetFigure()
    {
        //Given
        ShapeCollector shape = new ShapeCollector();
        Triangle triangle = new Triangle(2.0,3.0);
        Square square = new Square(5.0);
        Circle circle = new Circle(3.0);
        shape.addFigure(triangle);
        shape.addFigure(circle);
        shape.addFigure(square);
        //When
        Shape figure = shape.getFigure(2);
        //Then
        Assert.assertEquals(figure, square);
    }

    @Test
    public void testShowFigures()
    {
        //Given
        ShapeCollector shape = new ShapeCollector();
        Square square = new Square(5.0);
        //When
        shape.addFigure(square);
        shape.getFigure(0);
        //Then
        shape.showFigures();
    }
}
