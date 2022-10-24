package shapes;

public class Triangle extends Shape {

    private double side1;
    private double side2;
    private double hypotenuse;

    public Triangle(double side1, double side2) {
        this.side1 = side1;
        this.side2 = side2;
        this.hypotenuse = calculateHypotenuse();
    }

    public Triangle() {}

    public double getSide1() {
        return side1;
    }

    public double getSide2() {
        return side2;
    }

    public double getHypotenuse() {
        return hypotenuse;
    }

    private double calculateHypotenuse() {
        return Math.sqrt(Math.pow(this.side1, 2) + Math.pow(this.side2, 2));
    }

    @Override
    public double getArea() {
        return (this.side1 * this.side2) / 2;
    }

    @Override
    public void drawShape() {
        System.out.println("Draw triangle!");
    }

    @Override
    public String getShapeInfo() {
        return Triangle.class.getSimpleName()
                + ": area: " + String.format("%.2f", getArea())
                + "  hypotenuse: " + String.format("%.2f", this.hypotenuse)
                + "  color: " + getColor() + ".";
    }
}
