package ThemPhanTu;

import java.util.Arrays;
import java.util.Scanner;

public class themPhanTu {
    public static void main(String[] args) {
        String[] arr = {"nhan", "hoai", "thang"};
        String[] newArr;
        Scanner sc = new Scanner(System.in);
        int choice = -1;
        do {
            System.out.println("Nhap gia tri can chen : ");

            String inputValue = sc.nextLine();
            System.out.println("Nhap vi tri can chen : ");
            int stt = Integer.parseInt(sc.nextLine());
            int index = stt - 1;
            newArr = add(arr, inputValue, index);
            System.out.println("Mang moi thu duoc : " + Arrays.toString(newArr));
            arr=newArr;
            System.out.println("1. Nhap 1 de tiep tuc !");
            System.out.println("0. Nhap phim bat ky de thoat !");
            choice =Integer.parseInt(sc.nextLine()) ;
        } while (choice == 1);
    }

    public static String[] add(String[] arr, String input, int index) {
        String[] newArray = new String[arr.length + 1];
        for (int i = 0; i < arr.length+1; i++) {
            if (i < index) {
                newArray[i] = arr[i];
            } else {
                if (i == index) {
                    newArray[i] = String.valueOf(input);
                } else
                      newArray[i] = arr[i-1];
            }
        }
        return newArray;
    }
}
