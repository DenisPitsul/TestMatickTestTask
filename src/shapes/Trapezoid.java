package shapes;

public class Trapezoid extends Shape {
    private double topSide;
    private double bottomSide;
    private double height;
    private double midline;

    public Trapezoid(double topSide, double bottomSide, double height) {
        this.topSide = topSide;
        this.bottomSide = bottomSide;
        this.height = height;
        this.midline = calculateMidline();
    }

    public double getTopSide() {
        return topSide;
    }

    public double getBottomSide() {
        return bottomSide;
    }

    public double getHeight() {
        return height;
    }

    public double getMidline(){
        return this.midline;
    }

    private double calculateMidline() {
        return (topSide + bottomSide) / 2;
    }

    @Override
    public double getArea() {
        return this.midline * height;
    }

    @Override
    public void drawShape() {
        System.out.println("Draw trapezoid!");
    }

    @Override
    public String getShapeInfo() {
        return Trapezoid.class.getSimpleName()
                + ": area: " + String.format("%.2f", this.getArea())
                + "  midline: " + String.format("%.2f", this.midline)
                + "  color: " + getColor() + ".";
    }
}
