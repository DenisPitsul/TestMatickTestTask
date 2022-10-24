import factory.ShapeFactory;
import shapes.Shape;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Shape> shapes = createShapeList();
        shapes.forEach(shape -> System.out.println(shape.getShapeInfo()));
    }

    public static List<Shape> createShapeList() {
        List<Shape> shapes = new ArrayList<>();
        int numberOfShapes = (int) (Math.random() * 20 + 1);

        for(int i = 0; i < numberOfShapes ; i++){
            Shape shape = ShapeFactory.getRandomShape();
            shapes.add(shape);
        }
        return shapes;
    }
}