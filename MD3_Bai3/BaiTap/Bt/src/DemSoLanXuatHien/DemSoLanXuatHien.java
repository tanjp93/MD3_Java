package DemSoLanXuatHien;

import java.util.Arrays;
import java.util.Scanner;

public class DemSoLanXuatHien {
    public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    int rows, cols;
        do

    {
        do {
            System.out.println("Nhap so hang : ");
            rows = Integer.parseInt(sc.nextLine());
            System.out.println("Nhap so cot : ");
            cols = Integer.parseInt(sc.nextLine());
            if (rows > 10 || cols > 10) {
                System.out.println("So dong va so cot khong qua 10! ");
            }
        } while (rows > 10);
    } while(cols >10);
    int[][] arr = new int[rows][cols];
    arr=

    creatArr(arr);
        System.out.println(" Mang cua ban : "+Arrays.deepToString(arr));
}

    public static int[][] creatArr(int[][] arr) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.println("Nhap gia tri vi tri dong :" + i + "\t cot :" + j);
                arr[i][j] = Integer.parseInt(sc.nextLine());
            }
        }
        return arr;
    }
    public static int count(int[][] arr,int input){
        int count=0;
        for (int i = 0; i <arr.length ; i++) {
            for (int j = 0; j < arr[i].length ; j++) {
                if (arr[i][j]==input){
                    count+=1;
                }
            }
        }return count;
    }

}
