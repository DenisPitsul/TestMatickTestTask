package shapes;

public abstract class Shape {
    private static final String[] COLORS = {"Red", "Blue", "Green", "Yellow", "Orange", "Black", "Blue", "Brown", "White", "Violet"};
    private String color;

    public Shape() {
        int index = (int) (Math.random() * COLORS.length + 0);
        this.color = COLORS[index];
    }

    public abstract double getArea();
    public abstract void drawShape();
    public abstract String getShapeInfo();

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
