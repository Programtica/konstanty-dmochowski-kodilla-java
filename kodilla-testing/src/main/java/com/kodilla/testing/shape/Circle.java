package com.kodilla.testing.shape;

public class Circle implements Shape
{
    double radius;

    public Circle(double radius)
    {
        this.radius = radius;
    }

    public String getShapeName()
    {
        String name = "Circle";
        return name;
    }

    public double getField()
    {
        double field = Math.PI*Math.pow(radius,2);
        return field;
    }
}
