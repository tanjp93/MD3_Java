package AccessModifier;

public class CircleAcc {
    private static Double radius;
    private static String color;
    public CircleAcc() {
        radius = 1.0;
        color = "red";
    }
    public CircleAcc(Double r, String cl) {
        radius = r;
        color = cl;
    }

    public static Double getRadius() {
        return radius;
    }

    public static String getColor() {
        return color;
    }

    public static void setRadius(Double radius) {
        CircleAcc.radius = radius;
    }

    public static void setColor(String color) {
        CircleAcc.color = color;
    }
}
