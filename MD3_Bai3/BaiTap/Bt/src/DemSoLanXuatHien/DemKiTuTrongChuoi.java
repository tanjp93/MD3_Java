package DemSoLanXuatHien;

import java.util.Arrays;
import java.util.Scanner;

public class DemKiTuTrongChuoi {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println(" Nhap Chuoi cua ban : ");
        String input = sc.nextLine();
        System.out.println(" Chuoi cua ban :" + input);
        int count = 0;
        System.out.println("Nhap ky tu ban can tim kiem :");
        char inputNo = sc.nextLine().charAt(0);
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == inputNo) {
                count += 1;
            }
        }
        System.out.println(" so " + inputNo + " co : " + count + " lan");
    }
}
