package ThietKeLopFan;

public class Fan {
    final int SLOW = 1;
    final int MEDIUM = 2;
    final int FAST = 3;


    private int speed ;
    private final boolean turnOn = true;
    private final boolean turnOff = false;
    private boolean status=turnOff ;
    private double radius;
    private String color;


    public Fan(int speed, boolean status, double radius, String color) {
        this.speed = speed;
        this.status = status;
        this.radius = radius;
        this.color = color;
    }

    public Fan() {
        this.speed=SLOW ;
        this.status = turnOff;
        this.radius = 5.0;
        this.color ="Blue";
    }

    public int getSpeed() {
        return this.speed;
//        String speedNotice;
//        if (this.speed == 1) {
//            speedNotice = "SLOW";
//        } else if (this.speed == 2) {
//            speedNotice = "MEDIUM";
//        } else speedNotice = "FAST";
//        return speedNotice;
    }

    public Boolean getStatus() {
        return this.status;
    }

    public String setStatus(boolean status) {
        String statusNotce;
        if (status) {
            statusNotce = "ON";
        } else statusNotce = "OFF";
        return statusNotce;
    }

    public Double getRadius() {
        return this.radius;
    }

    public String getColor() {
        return this.color;
    }

    public String setColor(String color) {
        return this.color;
    }

    public String display() {

        return "Status :" + setStatus(this.status) + "\tSpeed : " + getSpeed() + "\tRadius : " + getRadius() + "\tcolor :" + getColor();
    }
}
