package A802;

public abstract class Shape implements Printable, Comparable {
    private int x;
    private int y;

    public Shape(int x, int y) {
        setPosition(x, y);
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setPosition(int x, int y) {
        setX(x);
        setY(y);
    }

    public double getArea(){
        return getX() * getY();
    }

    public double getPerimeter(){
        return getX() + getY();
    }
}
