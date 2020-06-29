package main.javacom.homework4.shape.abstact;

import main.javacom.homework4.interfaces.AreaMeasurable;
import main.javacom.homework4.interfaces.PerimeterMeasurable;
import main.javacom.homework4.vertex.Vertex;
import main.javacom.homework4.vertex.Vertex2D;

import java.util.List;

public abstract class PlaneShape extends Shape implements AreaMeasurable, PerimeterMeasurable {

    protected PlaneShape(List<Vertex> vertexList, String name) {
        super(vertexList, name);
    }

    public static double getDistance(Vertex2D a, Vertex2D b) {
        return Math.sqrt(Math.pow(a.getX() - b.getX(), 2) + Math.pow(a.getY() - b.getY(), 2));
    }

    @Override
    public String toString() {
        return super.toString() + ", Area: " + this.getArea() + ", Perimeter: " + this.getPerimeter();
    }
}
