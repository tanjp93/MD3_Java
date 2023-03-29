package Triangle;

public class Shape {
    boolean filled=true;
    String color="white";

    public Shape() {
    }
    public Shape(boolean filled, String color) {
        this.filled = filled;
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "A Shape's property is " +
                "filled=" + filled +
                ", color='" + color ;
    }
}
