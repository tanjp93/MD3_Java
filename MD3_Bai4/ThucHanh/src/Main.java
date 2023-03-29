

import rikkei.academy.Rectangle;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Nhap chieu dai : ");
        double width=sc.nextDouble();
        System.out.println("Nhap chieu cao : ");
        double height=sc.nextDouble();
        Rectangle rectangle = new Rectangle(width, height);
        System.out.println("Kich thuoc hinh chu nhat : "+rectangle.display());
        System.out.println(" Dien tich hinh chu nhat :"+rectangle.getArea());
        System.out.println(" Chu vi hinh chu nhat :"+rectangle.getPerimeter());


// write your code here

    }
}