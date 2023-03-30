package Bai3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("Phan tu dau tien : ");
            int x = scanner.nextInt();
            System.out.println("Phan tu thu 2 : ");
            int y = scanner.nextInt();
            int add = x + y;
            int subtract = x - y;
            int multiply = x * y;
            int divide = x / y;
            System.out.println("Addition : " + add);
            System.out.println("Subtraction : " + subtract);
            System.out.println("Multiply : " + multiply);
            System.out.println("Divide : " + divide);
        } catch (ArithmeticException e) {
            e.printStackTrace();
        }
        catch (InputMismatchException e){
            e.printStackTrace();
        }
        System.out.println("helllo");
    }
}
