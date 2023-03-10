package TimGiaTriNhoNhat;

import java.util.Arrays;
import java.util.Scanner;

public class TimGiaTriNhoNhat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size;
        int[] arr;
        int[] result;
        do {
            System.out.println("Nhap kich thuoc mang :");
            size = sc.nextInt();
        } while (size >= 20);
        while (size < 20) {
            arr = new int[size];
            result = new int[2];
            for (int i = 0; i < size; i++) {
                System.out.println("Nhap phan tu thu  :" + "\t");
                arr[i] = sc.nextInt();
            }
            result = min(arr);
            System.out.println(" Mang cua ban la : " + "\t" + Arrays.toString(arr));
            System.out.println("\nGia tri nho nhat cua mang la :" + result[0] + " tai vi tri " + result[1]);
        }
    }

    public static int[] min(int[] arr) {
        int min = arr[0];
        int stt = 1;
        int[] result=new int[2];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
                System.out.println("a");
                stt = i + 1;
            }
        }
        result=new  int[]{min,stt};
        System.out.println(" result+"+Arrays.toString(result));
        return result;
    }
}
