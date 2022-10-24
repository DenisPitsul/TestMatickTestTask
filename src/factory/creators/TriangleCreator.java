package factory.creators;

import shapes.Shape;
import shapes.Triangle;

public class TriangleCreator implements ShapeCreator {

    @Override
    public Shape create() {
        double side1 = Math.random() * MAX_SHAPE_SIDE_VALUE + 1;
        double side2 = Math.random() * MAX_SHAPE_SIDE_VALUE + 1;

        return new Triangle(side1, side2);
    }
}
