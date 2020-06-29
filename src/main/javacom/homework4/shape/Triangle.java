package main.javacom.homework4.shape;

import main.javacom.homework4.shape.abstact.PlaneShape;
import main.javacom.homework4.vertex.Vertex2D;

import java.util.List;

public class Triangle extends PlaneShape {

    private final double ab;
    private final double bc;
    private final double ca;

    public Triangle(Vertex2D a, Vertex2D b, Vertex2D c) {
        super(List.of(a, b, c), "Triangle");
        this.ab = getDistance(a, b);
        this.bc = getDistance(b, c);
        this.ca = getDistance(c, a);
    }

    @Override
    public double getArea() {
        double halfPerimeter = 0.5 * (ab + bc + ca);
        return Math.sqrt(halfPerimeter * (halfPerimeter - ab) * (halfPerimeter - bc) * (halfPerimeter - ca));
    }

    @Override
    public double getPerimeter() {
        return ab + bc + ca;
    }
}
