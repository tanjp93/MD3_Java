package HeCacDoiTuongHinhHoc;

public class Rectangle extends Shape {
    double width;
    double height;
    public Rectangle() {
        this.width = 1.0;
        this.height = 1.0;
    }
    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public Rectangle(String color, boolean filled, double width, double height) {
        super(color, filled);
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    public double area(){
        return height*width;
    }
    public double perimeter(){
        return 2*(height+width);
    }

    @Override
    public String toString() {
        return "A Rectangle with" +
                " width = " + width +
                ", height =" + height +
                ", color = " + color + '\'' +
                ", filled = " + filled ;
    }
}
