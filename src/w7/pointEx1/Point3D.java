package pointEx1;

public class Point3D extends Point {
    private int z;
    public Point3D(int x, int y, int z) {
        super(x,y);
        setZ(z);
    }

    public int getZ() {
        return z;
    }

    public void setZ(int z) {
        this.z = z;
    }
}
