package rikkei.academy;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    float width,height;
    Scanner scanner=new Scanner(System.in);
        System.out.println("Enter width : ");
        width= scanner.nextFloat();
        System.out.println("Enter height : ");
        height= scanner.nextFloat();
        System.out.println("area = " + width*height);
    }

}
