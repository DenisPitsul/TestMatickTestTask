package shapes;

public class Circle extends Shape {

    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    @Override
    public double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    public void drawShape() {
        System.out.println("Draw circle!");
    }

    @Override
    public String getShapeInfo() {
        return Circle.class.getSimpleName()
                + ": area: " + String.format("%.2f", this.getArea())
                + "  radius: " + String.format("%.2f", this.radius)
                + "  color: " + getColor() + ".";
    }
}
