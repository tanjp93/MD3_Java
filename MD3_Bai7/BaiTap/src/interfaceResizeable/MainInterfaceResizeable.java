package interfaceResizeable;

import java.util.Scanner;

public class MainInterfaceResizeable {
    public static void main(String[] args) {
        int scale=(int) Math.round(Math.random()*10);
        Shape[] shapes=new Shape[3];
        shapes[0]=new Circle(3.5);
        shapes[1]=new Rectangle(4,5);
        shapes[2]=new Square(4);
        System.out.println("Base : "+shapes[0]);
        System.out.println("Base : "+ shapes[1]);
        System.out.println("Base : "+ shapes[2]);
        shapes[0].changeSize(scale);
        shapes[1].changeSize(scale);
        shapes[2].changeSize(scale);
        System.out.println("scale : "+scale);
        System.out.println("After : "+shapes[0]);
        System.out.println("After : "+ shapes[1]);
        System.out.println("After : "+ shapes[2]);
    }
}
