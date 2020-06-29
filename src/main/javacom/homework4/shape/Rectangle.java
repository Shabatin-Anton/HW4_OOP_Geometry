package main.javacom.homework4.shape;

import main.javacom.homework4.shape.abstact.PlaneShape;
import main.javacom.homework4.vertex.Vertex2D;

import java.util.List;

public class Rectangle extends PlaneShape {

    private final double width;
    private final double height;

    public Rectangle(Vertex2D a, double width, double height) {
        super(List.of(a), "Rectangle");
        this.height = height;
        this.width = width;
    }

    @Override
    public double getArea() {
        return height * width;
    }

    @Override
    public double getPerimeter() {
        return (width * 2) + (height * 2);
    }
}
