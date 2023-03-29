package XoaKhoiPhanTu;

import java.util.Arrays;
import java.util.Scanner;

public class XoaPhanTu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size;
        do {
                System.out.println("Nhap kich thuoc cua mang :");
                size = Integer.parseInt(sc.nextLine());
                if (size >= 10) {
                    System.out.println("Khong duoc qua 10 don vi!");
                }
            } while (size > 10);

            String[] arr = new String[size];
            for (int i = 0; i < size; i++) {
                System.out.println("Nhap phan tu thu " + i + " :");
                arr[i] = sc.nextLine();
            }
            System.out.println("Mang cua ban :" + Arrays.toString(arr));
            System.out.println("Nhap gia tri can xoa :");
            String input = sc.nextLine();
            String[] updateArr = delInput(arr, input);
            System.out.println("Mang moi cua ban : " + Arrays.toString(updateArr));

    }

    public static String[] delInput(String[] arr, String input) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equalsIgnoreCase(input)) {
                count += 1;
            }
        }
        String[] newArr = new String[arr.length - count];
        for (int i = 0; i < arr.length; i++) {
            if (!arr[i].equalsIgnoreCase(input)) {
                for (int j = 0; j < newArr.length; j++) {
                newArr[j] = (i > count) ? arr[i - count] : arr[i];
                }
            }
        }
        return newArr;
    }
}