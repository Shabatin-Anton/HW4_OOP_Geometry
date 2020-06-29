package main.java.com.homework4;

import main.java.com.homework4.shape.*;
import main.java.com.homework4.shape.abstact.Shape;
import main.java.com.homework4.vertex.Vertex2D;
import main.java.com.homework4.vertex.Vertex3D;

public class Main {
    public static void main(String[] args) {
        Triangle triangle = new Triangle(new Vertex2D(-4, -3), new Vertex2D(0, 2), new Vertex2D(3, 4));

        Rectangle rectangle = new Rectangle(new Vertex2D(1, 2), 3, 4);

        Circle circle = new Circle(new Vertex2D(12, 12), 6);

        SquarePyramid squarePyramid = new SquarePyramid(new Vertex3D(10, 11, 12), 5, 4);

        Cuboid cuboid = new Cuboid(new Vertex3D(-6, -6, -6), 2, 2, 2);

        Sphere sphere = new Sphere(new Vertex3D(-10, -11, -12), 3);

        Shape[] firstTaskOut = {triangle, rectangle, circle, squarePyramid, cuboid, sphere};

        for (int i = 0; i < firstTaskOut.length; i++) {
            System.out.println(firstTaskOut[i]);
        }
    }
}
