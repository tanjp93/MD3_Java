package CircleAndCylinder;

public class Shape {
    public static void main(String[] args) {
        Circle circle0=new Circle();
        Circle circle1=new Circle(5,"Blue");
        System.out.println(circle0);
        System.out.println(circle1);
        Cylinder cylinder0=new Cylinder();
        Cylinder cylinder1=new Cylinder(10,"red",20);
        System.out.println(cylinder0);
        System.out.println(cylinder1);
    }
}
