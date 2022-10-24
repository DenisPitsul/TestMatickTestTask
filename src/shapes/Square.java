package shapes;

public class Square extends Shape {

    private double side;

    public Square(double side) {
        this.side = side;
    }

    public Square() {}

    public double getSide() {
        return side;
    }

    @Override
    public double getArea() {
        return Math.pow(side, 2);
    }

    @Override
    public void drawShape() {
        System.out.println("Draw square!");
    }

    @Override
    public String getShapeInfo() {
        return Square.class.getSimpleName()
                + ": area: " + String.format("%.2f", this.getArea())
                + "  side: " +  String.format("%.2f", this.side)
                + "  color: " + getColor() + ".";
    }
}
