package ss06_inheritance.exercise;

import java.util.Arrays;

public class Point3D extends Point2D {
    private float z;
    public Point3D() {

    }
    public Point3D(float x, float y, float z) {
        super(x,y);
        this.z = z;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }
    public void setXYZ(float x, float y, float z) {
        super.setXY(x,y);
        this.setZ(z);
    }
    public float[] getXYZ() {
        float[] xyz = {super.getX(), super.getY(), this.getZ()};
        return xyz;
    }

    @Override
    public String toString() {
        return "x,y,z: " + super.getX() + ", " + super.getY() + ", " + this.getZ() +
                " array: " + Arrays.toString(this.getXYZ());
    }
}
