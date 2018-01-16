package com.kodilla.testing.shape;

public class Triangle implements Shape
{
    double side, height;

    public Triangle(double side, double height)
    {
        this.side = side;
        this.height = height;
    }

    public String getShapeName()
    {
        String name = "Triangle";
        return name;
    }

    public double getField()
    {
        double field = (side*height)/2;
        return field;
    }
}
