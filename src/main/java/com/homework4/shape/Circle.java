package main.java.com.homework4.shape;

import main.java.com.homework4.shape.abstact.PlaneShape;
import main.java.com.homework4.vertex.Vertex2D;

import java.util.List;

public class Circle extends PlaneShape {

    private final double radius;

    public Circle(Vertex2D a, double radius) {
        super(List.of(a), "Circle");
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }
}
