package pointEx2;

public class Point {
    private int x;
    private int y;

    public Point(int x, int y) {
        setX(x);
        setY(y);
    }

    public Point(){
        setX(0);
        setY(0);
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

    @Override
    public String toString() {
        return "x: " + x + " y: " + y;
    }
}
