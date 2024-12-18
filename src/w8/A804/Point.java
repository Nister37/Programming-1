package A804;

public class Point {
    private int x;
    private int y;
    public static final String COLOR="red";
    public static int count=0;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
        count++;
    }

}
