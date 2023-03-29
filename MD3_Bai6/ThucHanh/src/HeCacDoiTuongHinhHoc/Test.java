package HeCacDoiTuongHinhHoc;

public class Test {
    public static void main(String[] args) {
        class Circle {
            private int radius;

            public Circle(int radius) {
                this.radius = radius;
            }

            public double getArea() {
                return Math.PI * this.radius * this.radius;
            }

            public double getPerimeter() {
                return Math.PI * 2 * this.radius;
            }
        }
         class Cylinder extends Circle {
            private int height;
            public Cylinder(int radius, int height) {
                super(radius);
                this.height =height;
            }
            @Override
            public double getArea() {
                return super.getArea() * 2 + super.getPerimeter() * height;
            }
            public double getVolume(){
                return super.getArea() * this.height;
            }
        }
    Cylinder cylinder=new Cylinder(5,10);
        System.out.println(cylinder.getArea());
        System.out.println( cylinder.getVolume());
    }
}
