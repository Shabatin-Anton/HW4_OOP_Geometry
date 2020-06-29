package main.javacom.homework4.shape.abstact;

import main.javacom.homework4.interfaces.AreaMeasurable;
import main.javacom.homework4.interfaces.VolumeMeasurable;
import main.javacom.homework4.vertex.Vertex;

import java.util.List;

public abstract class SpaceShape extends Shape implements AreaMeasurable, VolumeMeasurable {

    protected SpaceShape(List<Vertex> vertexList, String name) {
        super(vertexList, name);
    }

    @Override
    public String toString() {
        return super.toString() + ", Area: " + this.getArea() + ", Volume: " + this.getVolume();
    }
}
