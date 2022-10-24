package factory.creators;

import shapes.Circle;
import shapes.Shape;

public class CircleCreator implements ShapeCreator {

    @Override
    public Shape create() {
        double radius = Math.random() * MAX_SHAPE_SIDE_VALUE + 1;
        
        return new Circle(radius);
    }
}
