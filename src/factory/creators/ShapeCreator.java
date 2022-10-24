package factory.creators;

import shapes.Shape;

public interface ShapeCreator {

    int MAX_SHAPE_SIDE_VALUE = 10;

    Shape create();
}
