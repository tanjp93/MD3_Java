package TinhTongCacSoOMotCotXacDinh;

import java.util.Arrays;
import java.util.Scanner;

public class TinhTong1Cot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows, cols;
        do {
            do {
                System.out.println("Nhap so hang : ");
                rows = Integer.parseInt(sc.nextLine());
                System.out.println("Nhap so cot : ");
                cols = Integer.parseInt(sc.nextLine());
                if (rows > 10 || cols > 10) {
                    System.out.println("So dong va so cot khong qua 10! ");
                }
            } while (rows > 10);
        } while (cols > 10);
        int[][] arr = new int[rows][cols];
        arr=creatArr(arr);
        System.out.println(" Mang cua ban : "+Arrays.deepToString(arr));
        System.out.println(" Nhap cot ban muon tinh tong ");
        int colNum=sc.nextInt()-1;
        int sum=totalCol(arr,colNum);
        System.out.println(" Tong cot " +colNum+ "\t"+sum);
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
    public static int totalCol(int[][] arr, int colNum){
        int sum=0;
        for (int i = 0; i <arr.length ; i++) {
            sum+=arr[i][colNum];
        }return  sum;
    }
}
