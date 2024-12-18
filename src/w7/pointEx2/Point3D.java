package pointEx2;

public class Point3D extends Point {
    private int z;

    public Point3D(int x, int y, int z) {
        super(x,y);
        setZ(z);
    }
    public Point3D() {
        super(0,0);
        setZ(0);
    }

    public int getZ() {
        return z;
    }

    public void setZ(int z) {
        this.z = z;
    }

    @Override
    public String toString() {
        return "x: " + getX() + " y: " + getY() + " z: " + z;
    }
}
