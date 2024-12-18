package A802;

public class Circle extends Shape{
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

    @Override
    public boolean isEqualTo(Comparable c) {
        if(c instanceof Circle cir){
            return this.radius == cir.getRadius();
        }else{
            return false;
        }
    }

    @Override
    public boolean isGreaterThan(Comparable c) {
        if(c instanceof Circle cir){
            return this.radius > cir.getRadius();
        }else{
            return false;
        }
    }

    @Override
    public boolean isLessThan(Comparable c) {
        if(c instanceof Circle cir){
            return this.radius < cir.getRadius();
        }else {
            return false;
        }
    }
}
