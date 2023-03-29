package CircleAndCylinder;

public class Circle {
    double radius=1.0;
    String color="Yellow";

    public Circle() { }
    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }
    public double getRadius() {
        return radius;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public double area(){
        return Math.PI*Math.pow(radius,2);
    }
    public double perimeter(){
        return 2*Math.PI*radius;
    }

    @Override
    public String toString() {
        return "A Circle with " +
                "radius=" + radius +
                ", color='" + color +
                ", area='" + area() +
                ", perimeter='" + perimeter();
    }
}
