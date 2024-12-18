package A805;

public class Point {
    private int x;
    private int y;
    private static final String COLOR="red";
    private static int count=0;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
        count++;
    }

    public static String getColor(){
        return COLOR;
    }
    public static int getCount(){
        return count;
    }

}
