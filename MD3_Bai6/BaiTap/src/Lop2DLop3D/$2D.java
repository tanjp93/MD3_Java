package Lop2DLop3D;

import java.util.Arrays;

public class $2D {
    float x=0f;
    float y=0f;

    public $2D() {
    }
    public $2D(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }
    public float[] getXY(){
        return new float[]{x,y};
    }

    @Override
    public String toString() {
        return "A 2D point's position is {" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
