package main.java.com.homework4.shape;

import main.java.com.homework4.shape.abstact.SpaceShape;
import main.java.com.homework4.vertex.Vertex3D;

import java.util.List;

public class Cuboid extends SpaceShape {

    private final double width;
    private final double height;
    private final double depth;

    public Cuboid(Vertex3D a, double width, double height, double depth) {
        super(List.of(a), "Cuboid");
        this.width = width;
        this.height = height;
        this.depth = depth;
    }

    @Override
    public double getArea() {
        return 2 * ((width * height) + (height * depth) + (depth * width));
    }

    @Override
    public double getVolume() {
        return width * height * depth;
    }
}
