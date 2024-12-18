import pointEx1.*;

public class Ex01 {
    public static void main(String[] args) {
        Point point = new Point(1, 2);
        Point3D point3D = new Point3D(4, 5, 6);
        System.out.println("Coordinates point: " + point.getX() + ','

                + point.getY());
        System.out.println("Coordinates point3d: " + point3D.getX() + ','

                + point3D.getY() + ',' + point3D.getZ());
    }
}
