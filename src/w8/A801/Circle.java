package A801;

public class Circle extends Shape {
    private int radius;

    public Circle(int x, int y, int radius) {
        super(x,y);
        setRadius(radius);
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return super.getArea();
    }

    @Override
    public double getPerimeter() {
        return super.getPerimeter();
    }

    @Override
    public void print() {
        System.out.printf("Circle\n" +
                "======\n" +
                "Position: (%d,%d)\n" +
                "Radius:   %d", getX(), getY(), getRadius());
    }
}
