package pointEx4;

import java.util.Objects;

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

    @Override
    public boolean equals(Object obj) {
        if(!(obj instanceof Point3D)){
            return false;
        }else{
            Point3D p = (Point3D)obj;
            boolean result = super.equals(p);
            boolean result2 = Objects.equals(getZ(), p.getZ());
            return result && result2;
        }
    }
    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getZ());
    }
}
