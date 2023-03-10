package TimGiaTriNhoNhat;

import java.util.Arrays;
import java.util.Scanner;

public class TimGiaTriNhoNhat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int min, rows, cols;
        do {
            do {
                System.out.println("Nhap so hang : ");
                rows = Integer.parseInt(sc.nextLine());
                System.out.println("Nhap so cot : ");
                cols = Integer.parseInt(sc.nextLine());
                if (rows>10||cols>10){
                    System.out.println("So dong va so cot khong qua 10! ");
                }
            } while (rows > 10);
        } while (cols > 10);
        int[][] arr = new int[rows][cols];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.println("Nhap gia tri vi tri dong :" + i + "\t cot :" + j);
                arr[i][j] = Integer.parseInt(sc.nextLine());
            }
        }
        System.out.println("Mang cua ban : " + Arrays.deepToString(arr));
        min = findMin(arr);
        System.out.println("Gia tri nho cua mang la : " + min);
    }

    public static int findMin(int[][] arr) {
        int min = arr[0][0];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] < min) {
                    min = arr[i][j];
                }
            }
        }
        return min;
    }
}
