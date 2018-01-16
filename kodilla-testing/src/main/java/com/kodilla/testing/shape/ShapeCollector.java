package com.kodilla.testing.shape;

import java.util.ArrayList;

public class ShapeCollector
{
    public ArrayList<Shape> shapes = new ArrayList<>();

    public void addFigure(Shape shape)
    {
        shapes.add(shape);
    }

    public void removeFigure(Shape shape)
    {
        shapes.remove(shape);
    }

    public Shape getFigure(int n)
    {
        return shapes.get(n);
    }

    public void showFigures()
    {
        for(int i=0; i<shapes.size(); i++)
        {
            System.out.println(getFigure(i).getField());
            System.out.println(getFigure(i).getShapeName());
        }
    }
}
