package factory.creators;

import shapes.Shape;
import shapes.Square;

public class SquareCreator implements ShapeCreator {

    @Override
    public Shape create() {
        double side = Math.random() * MAX_SHAPE_SIDE_VALUE + 1;

        return new Square(side);
    }
}
