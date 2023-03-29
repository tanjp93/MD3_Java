package Triangle;

public class Triangle extends Shape {
    double a = 1;
    double b = 1;
    double c = 1;

    public Triangle() {
    }

    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public Triangle(boolean filled, String color, double a, double b, double c) {
        super(filled, color);
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getPerimeter() {
        return a + b + c;
    }

    public double getArea() {
        double halfPermeter = getPerimeter() / 2;
        return Math.sqrt(halfPermeter * (halfPermeter - a) * (halfPermeter - b) * (halfPermeter - c));
    }

    @Override
    public String toString() {
        return "A Triangle 's property with" +
                "a=" + a +
                ", b=" + b +
                ", c=" + c +
                ", filled=" + filled +
                ", color='" + color + '\'' +
                ", getPerimeter='" + getPerimeter() + '\'' +
                ", getArea='" + getArea() + '\'' +
                '}';
    }
}

