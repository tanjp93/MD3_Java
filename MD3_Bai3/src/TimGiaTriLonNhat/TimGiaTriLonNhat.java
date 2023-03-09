package TimGiaTriLonNhat;

import java.util.Arrays;
import java.util.Scanner;

public class TimGiaTriLonNhat {
    public static void main(String[] args) {
        int size;
        int[] arr;
        Scanner sc=new Scanner(System.in);
        do {
            System.out.println(" Nhap kich thuoc mang : ");
            size= sc.nextInt();
            arr=new int[size];
            if (size>20){
                System.out.println(" Kich thuoc mang khong hop le!");
            }
        }while (size>20);
        for (int i = 0; i < size; i++) {
            System.out.println("Nhap phan tu thu "+i + ":");
            arr[i]= sc.nextInt();
        }
        System.out.println("Mang cua ban : "+ Arrays.toString(arr));
        int max=arr[0];
        int stt=1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]>max){
                stt=i+1;
                max=arr[i];
            }
        }
        System.out.println("Gia tri lon nhat trong mang la : "+ max +"\t"+"tai vi tri "+ stt);
    }
}
