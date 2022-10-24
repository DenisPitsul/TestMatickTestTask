package factory.creators;

import shapes.Shape;
import shapes.Trapezoid;

public class TrapezoidCreator implements ShapeCreator {

    @Override
    public Shape create() {
        double sideA = Math.random() * MAX_SHAPE_SIDE_VALUE + 1;
        double sideB = Math.random() * MAX_SHAPE_SIDE_VALUE + 1;
        double height =Math.random() * MAX_SHAPE_SIDE_VALUE + 1;

        return new Trapezoid(sideA, sideB, height);
    }
}
