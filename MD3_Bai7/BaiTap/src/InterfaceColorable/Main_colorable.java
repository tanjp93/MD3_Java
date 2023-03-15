package InterfaceColorable;

public class Main_colorable {
    public static void main(String[] args) {
        Shape[] shapes=new Shape[]{new Circle(),new Rectangle(),new Square()};
        for (Shape shape:shapes ){
            if (shape instanceof Circle ){
                shape.howToColor();
            }
            if (shape instanceof Square ){
                shape.howToColor();
            }
        }
    }
}
