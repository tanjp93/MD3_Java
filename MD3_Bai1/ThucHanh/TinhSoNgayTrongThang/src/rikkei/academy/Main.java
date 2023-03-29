package rikkei.academy;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap so thang");
        int month = scanner.nextInt();
        int day;
        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                day = 31;
                System.out.println("Co " + day + " ngay");
                break;
            case 2:
                day = 28;
                System.out.println("Co " + day + " ngay");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                day = 30;
                System.out.println("Co " + day + " ngay");
                break;
            default:
                System.out.println("so thang khong dung dinh dang!");
        }
    }
}
