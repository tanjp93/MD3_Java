package DaoNguocCacPhanTu;

import java.util.Arrays;
import java.util.Scanner;

public class DaoNguocCacPhanTu {
    public static void main(String[] args) {
// write your code here
        Scanner sc = new Scanner(System.in);
        int size;

        do {
            System.out.println("Nhap do dai mang (be hon 20):");
            size = sc.nextInt();
            int[] arrBase = new int[size];
            int[] arrrReverse = new int[size];
            if (size >= 20) {
                System.out.println("Nhap lai do dai mang (be hon 20):");
                size = sc.nextInt();
            } else {
                for (int i = 0; i < size; i++) {
                    System.out.println("Nhap gia tri element " + i + " :");
                    arrBase[i] = sc.nextInt();
                }
                for (int i = 0; i < size; i++) {
                    arrrReverse[i] = arrBase[size -1- i];
                }
                    System.out.println("arrrReverse :" + Arrays.toString(arrrReverse));
            }
        } while (size >= 20);
    }
}
