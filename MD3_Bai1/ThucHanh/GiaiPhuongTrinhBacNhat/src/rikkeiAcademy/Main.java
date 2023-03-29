package rikkeiAcademy;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println(" Phuong trinh bac nhat");
        System.out.println(" cho bieu thuc a*x +b =c ,Tim x?");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap so a : ");
        double a = scanner.nextDouble();
        System.out.println("Nhap so b : ");
        double b = scanner.nextDouble();
        System.out.println("Nhap so c : ");
        double c = scanner.nextDouble();
        String x = a == 0 ? b == c ? "Phuong trinh co vo so nghiem" : "Phuong trinh vo nghiem" : String.valueOf((c - b) / a);
        System.out.println("x =" + x);
    }
}
