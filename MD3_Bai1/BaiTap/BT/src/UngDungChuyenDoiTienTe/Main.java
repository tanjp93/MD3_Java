package UngDungChuyenDoiTienTe;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Nhap so tien can chuyen doi : ");
            long USD = sc.nextLong();
            long VND = USD * 23000;
            System.out.println(VND+" vnd");
        }
    }
}
