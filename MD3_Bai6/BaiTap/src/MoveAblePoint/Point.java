package MoveAblePoint;

public class Point {
    float x=0;
    float y=0;

    public Point() {
    }
    public Point(float x, float y) {
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

    public String toString() {
        return "Point with position {" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
