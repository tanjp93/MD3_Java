package CircleAndCylinder;

public class Cylinder extends Circle  {
    double height=1;

    public Cylinder() {
    }
    public Cylinder(double height) {
        this.height = height;
    }
    public Cylinder(double radius, String color, double height) {
        super(radius, color);
        this.height = height;
    }
    @Override
    public double area(){
       return 2*Math.PI*radius*(radius+height);
    }
    @Override
    public double perimeter(){
       return 4*Math.PI*radius+2*height;
    }
    public double volume(){
       return Math.PI*Math.pow(radius,2)*height;
    }

    @Override
    public String toString() {
        return "Property of Cylinder is " +
                "height=" + height +
                ", radius=" + radius +
                ", color='" + color +
                ", area='" + area() +
                ", perimeter='" + perimeter() +
                ", volume='" + volume()
                ;
    }
}
