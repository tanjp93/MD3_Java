package UngDungCHoVayLai;

import java.util.Scanner;

public class ChoVayLai {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println(" Nhap so tien cho vay :");
            double money = sc.nextDouble();
            System.out.println(" Nhap so thang cho vay :");
            int month = sc.nextInt();
            System.out.println(" Nhap lai suat cho vay :");
            double interestRate = sc.nextDouble();
            double totalInterest = 0;
            for (int i = 0; i < month; i++) {
                totalInterest += month * money * interestRate / 100;
            }
            System.out.println("Neu gui " + money + " - " + month + "thang thi Tien lai la : " + totalInterest);
            System.out.println("Tong so tien thu ve la : " + money + totalInterest);
        }
    }
}
