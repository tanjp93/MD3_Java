package Lop2DLop3D;

public class $3D extends $2D{
    float z=0f;

    public $3D() {
    }
    public $3D(float z) {
        this.z = z;
    }

    public $3D(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }
    public float[] getXYZ(){
        return new float[]{x,y,z};
    }

    @Override
    public String toString() {
        return "A 3D point's position is{" +
                "z=" + z +
                ", x=" + x +
                ", y=" + y +
                '}';
    }
}
