package Triangle;

public class TriangleMain {
    public static void main(String[] args) {
        Shape shape0 = new Shape();
        Shape shape1 = new Shape(false, "red");
        Triangle triangle0 = new Triangle();
        System.out.println(shape0);
        System.out.println(shape1);
        System.out.println("-------------------------------------------");
        double a = 5;
        double b = 7;
        double c = 9;

        Triangle triangle1 = new Triangle();
        if (a + b > c || a + c > b || b + c > a) {
            triangle1 = new Triangle(a, b, c);
        } else {
            System.out.println("Please input edge !");
        }
        System.out.println(triangle0);
        System.out.println(triangle1);
    }
}
