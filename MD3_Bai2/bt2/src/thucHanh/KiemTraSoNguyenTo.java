package thucHanh;

import java.util.Scanner;

public class KiemTraSoNguyenTo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Nhap so bat ky : ");
            int number = sc.nextInt();
            if (number < 2) {
                System.out.println(number + " Khong phai la so nguyen to!");
            } else {
                int i = 2;
                boolean check = true;
                while (i < number) {
                    if (number % i == 0) {

                        check = false;
                        break;
                    }
                    i++;
                }
                if (check) {
                    System.out.println(number + " La so nguyen to!");
                } else System.out.println(number + " Khong phai la so nguyen to!");
            }
        }
    }
}
