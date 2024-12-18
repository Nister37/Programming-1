package A801;

public class Rectangle extends Shape{
    private int width;
    private int height;

    public Rectangle(int x, int y, int width, int height) {
        super(x, y);
        setDimensions(width, height);
    }

    public int getWidth() {
        return width;
    }

    public void setDimensions(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public int getHeight() {
        return height;
    }

    public double getArea() {
        return getWidth() * getHeight();
    }

    public double getPerimeter() {
        return getWidth() + getHeight();
    }

    @Override
    public void print() {
        System.out.printf("Rectangle\n" +
                "=========\n" +
                "Position: (%d, %d)\n" +
                "Width:    %d\n" +
                "Height:   %d", getX(), getY(), getWidth(), getHeight());
    }
}
