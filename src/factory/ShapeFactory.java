package factory;

import factory.creators.CircleCreator;
import factory.creators.SquareCreator;
import factory.creators.TrapezoidCreator;
import factory.creators.TriangleCreator;
import shapes.Shape;

public class ShapeFactory {

    public static Shape getRandomShape() {
        Shape shape = null;
        int x = (int) (Math.random() * 4 + 1);
        switch (x){
            case 1:
                shape = new CircleCreator().create();
                break;
            case 2:
                shape = new SquareCreator().create();
                break;
            case 3:
                shape = new TrapezoidCreator().create();
                break;
            case 4:
                shape = new TriangleCreator().create();
                break;
        }
        return shape;
    }
}
