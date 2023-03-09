package HienThiCacLoaiHinh;

import java.util.Scanner;

public class HienThiCacLoaiHinh {
    public static void main(String[] args) {
        int choice = -1;
        while (true) {
            char letter = '*';
            System.out.println("0.Exit");
            System.out.println("1.Draw rectangle");
            System.out.println("2.Draw square triangle");
            System.out.println("3.Draw reverse triangle");
            System.out.println("4.Draw isosceles  triangle");
            Scanner sc = new Scanner(System.in);
            choice = sc.nextInt();
            switch (choice) {

                case 1:
                    for (int i = 0; i < 5; i++) {
                        for (int j = 0; j < 5; j++) {
                            System.out.print("*");
                        }
                        System.out.println("");
                    }
                    break;
                case 2:
                    for (int i = 0; i < 5; i++) {
                        for (int j = 0; j < i; j++) {
                            System.out.print("*");
                        }
                        System.out.println("");
                    }
                    break;
                case 3:
                    for (int i = 0; i < 5; i++) {
                        for (int j = 5; j > i; j--) {
                            System.out.print("*");
                        }
                        System.out.println("");
                    }
                    break;
                case 4:
                    int i, j;
                    for(i = 1; i <= 4; i++) {
                        for(j = 1; j < 2 * 4; j++) {
                            if(Math.abs(4 - j)<= (i - 1)) {
                                System.out.printf("*");

                            } else {
                                System.out.printf(" ");
                            }
                        }
                        System.out.println("");
                    }

                    break;
                case 0:
                    System.exit(0);
                    break;
                default:
                    System.out.print("Yeu cau khong duoc chap nhan!");
                    break;
            }
        }
    }
}
