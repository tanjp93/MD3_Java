package HeCacDoiTuongHinhHoc;

public class Square extends  Rectangle{
    double side=1;

    public Square() {
    }
    public Square(double side) {
        this.side = side;
    }

    public double getSide() {
        return getWidth();
    }

    public void setSide(double side) {
        this.side=side;
    }

    public Square(String color, boolean filled, double width, double height) {
        super(color, filled, width, height);
        setWidth(width);
        setHeight(height);
    }
    @Override
    public void setWidth(double width){
        setSide(width);
    }
    @Override
    public void setHeight(double height){
        setSide(height);
    }

    @Override
    public String toString() {
        return "A Square with side = " + side +
                ", color = " + color +
                ", filled = " + filled ;
    }
}
