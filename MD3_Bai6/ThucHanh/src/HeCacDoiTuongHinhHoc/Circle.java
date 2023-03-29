package HeCacDoiTuongHinhHoc;

public class Circle extends Shape {
    Double radius;

    public Circle() {
        radius = 1.0;
    }
    public Circle(Double radius) {
        this.radius = radius;
    }

    public Circle(String color, boolean filled, Double radius) {
        super(color, filled);
        this.radius = radius;
    }

    public Double getRadius() {
        return radius;
    }
    public void setRadius(Double radius) {
        this.radius = radius;
    }

    public Double getArea() {
        return Math.PI*Math.pow(radius,2);
    }

    public Double getPerimeter() {
        return 2*radius*Math.PI;
    }

    @Override
    public String toString() {
        return "A Circle with color = " + color + " and " +"radius = " + radius +
                ", filled = " +  filled ;
    }
}
