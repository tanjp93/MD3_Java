package TimUocChungLonNhat;

import java.util.Scanner;

public class UCLN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {

            System.out.println("Nhap so a : ");
            int a = sc.nextInt();
            System.out.println("Nhap so b : ");
            int b = sc.nextInt();
            if (a == 0 || b == 0) {
                System.out.println("Khong co uoc chung");
            } else
                while (a != b) {
                    if (a > b) {
                        a -= b;
                        System.out.println("(a > b) a = " + a);
                        System.out.println("(a > b) b = " + b);
                    } else {
                        b -= a;
                        System.out.println("(a < b) a = " + a);
                        System.out.println("(a < b) b = " + b);
                    }
                }
            System.out.println("UCLN la : " + a);
        }
    }


}
