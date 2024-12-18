package A802;

public class Rectangle extends Shape {
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

    @Override
    public boolean isEqualTo(Comparable c) {
        if(c instanceof Rectangle rec) {
            return this.getWidth()==rec.getWidth() && this.getHeight()==rec.getHeight();
        }else{
            return false;
        }
    }

    @Override
    public boolean isGreaterThan(Comparable c) {
        if(c instanceof Rectangle rec) {
            if(this.getWidth()>rec.getWidth()){
                return true;
            }else {
                return this.getWidth() == rec.getWidth() && this.getHeight() > rec.getHeight();
            }
        }else{
            return false;
        }
    }

    @Override
    public boolean isLessThan(Comparable c) {
        if(c instanceof Rectangle rec) {
            if(this.getWidth()<rec.getWidth()){
                return true;
            }else {
                return this.getWidth() == rec.getWidth() && this.getHeight() < rec.getHeight();
            }
        }else{
            return false;
        }
    }
}
