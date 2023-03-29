package TimPhanTuLonThu2;

import java.util.Arrays;
import java.util.Scanner;

public class TimPhanTuLonThu2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int lonThu2;
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
        lonThu2=ToThu2(arr, cols);
        System.out.println("Gia tri lon 2 cua mang la : " + lonThu2);
    }
    public static int ToThu2(int[][] arr, int cols) {
// cach cua khoa!
//        int count = -1;
//        int[] maxArr = new int[arr.length * cols];
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = 0; j <arr[i].length ; j++) {
//                count++;
//                maxArr[count] = arr[i][j];
//            }
//        }
//
//       int max = Arrays.stream(maxArr).max().getAsInt();
//        int min = Arrays.stream(maxArr).min().getAsInt();
//        int result = min;
//        for (int i = 0; i < maxArr.length; i++) {
//            if (maxArr[i] < max && maxArr[i] > min){
//                result = maxArr[i];
//            }
//        }



        int max = arr[0][0];
        int min= arr[0][0];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] > max) {
                    max = arr[i][j];
                }
                if (arr[i][j] < min) {
                    min = arr[i][j];
                }
            }
        };
//
        int result = min;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] < max && arr[i][j] > result) {
                    result = arr[i][j];
                }
            }
        };


//        int lonThu2 = arr[0][0];
//
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = 0; j < arr[i].length; j++) {
//                   while (arr[i][j]<max){
//                       System.out.println("in");
//                     if (lonThu2<arr[i][j]){
//                         lonThu2=arr[i][j];
//                     }
//                }
//
//            }
//        }

        return result;
    }
}
// result = 0
// arr => max
//  result2 < max
