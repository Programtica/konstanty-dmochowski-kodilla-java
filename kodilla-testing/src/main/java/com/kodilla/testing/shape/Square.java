package com.kodilla.testing.shape;

public class Square implements Shape
{
    double side;

    public Square(double side)
    {
        this.side = side;
    }

    public String getShapeName()
    {
        String name = "Square";
        return name;
    }

    public double getField()
    {
        double field = Math.pow(side,2);
        return field;
    }
}
