package LuyenTapSuDungMang;

import java.util.Arrays;
import java.util.Scanner;

public class LuyenTapSuDungMang {
    public static void main(String[] args) {
        // write your code here
        int size;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.print("Enter a size:");
            size = scanner.nextInt();
            if (size > 30)
                System.out.println("Khong duoc  vuot qua 30 sinh vien : ");
        } while (size > 30);
        int[] array = new int[size];
        int count=0;
        for (int i = 0; i < size; i++) {
            System.out.println("Nhap diem cua SV thu " + i + "\t:");
            array[i] = scanner.nextInt();
            if (array[i]>5){
                count+=1;
            }
        }
        System.out.println(" Danh sach diem sinh vien " + "\t:" + Arrays.toString(array));
        System.out.println(" Co  " + count + "\t" +"sinh vien co diem tren trung binh !");
    }
}
