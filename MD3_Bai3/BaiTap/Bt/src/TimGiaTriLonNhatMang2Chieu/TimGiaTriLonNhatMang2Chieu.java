package TimGiaTriLonNhatMang2Chieu;

import java.util.Arrays;
import java.util.Scanner;

public class TimGiaTriLonNhatMang2Chieu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int max;
        System.out.println("Nhap so hang : ");
        int rows = Integer.parseInt(sc.nextLine());
        System.out.println("Nhap so cot : ");
        int cols = Integer.parseInt(sc.nextLine());
        int[][] arr = new int[rows][cols];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.println("Nhap gia tri vi tri dong :" + i + "\t cot :" + j);
                arr[i][j] = Integer.parseInt(sc.nextLine());
            }
        }
        System.out.println("Mang cua ban : " + Arrays.deepToString(arr));
        max=findMax(arr);
        System.out.println("Gia tri lon nhat cua mang la : " + max);
    }

    public static int findMax(int[][] arr) {
        int max = arr[0][0];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] > max) {
                    max = arr[i][j];
                }
            }
        }
        return max;
    }
}
