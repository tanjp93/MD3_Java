package MoveAblePoint;

public class MoveAblePoint extends Point {
    float xSpeed=10f;
    float ySpeed=10f;

    public MoveAblePoint() {
    }
    public MoveAblePoint(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public MoveAblePoint(float x, float y, float xSpeed, float ySpeed) {
        super(x, y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public float getxSpeed() {
        return xSpeed;
    }

    public void setxSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public float getySpeed() {
        return ySpeed;
    }

    public void setySpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }
    public float [] getSpeed(){
        return new float[]{xSpeed,ySpeed};
    }
    public void move() {
        x+=this.xSpeed;
        y+=this.ySpeed;
    }

    @Override
    public String toString() {
        return "A point move with {" +
                "xSpeed=" + xSpeed +
                ", ySpeed=" + ySpeed +
                ", and moved position is x=" + x +
                ", y=" + y +
                '}';
    }
}
