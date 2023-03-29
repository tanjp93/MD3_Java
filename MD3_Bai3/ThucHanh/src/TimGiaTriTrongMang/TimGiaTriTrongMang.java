package TimGiaTriTrongMang;

import java.util.Scanner;

public class TimGiaTriTrongMang {
    public static void main(String[] args) {
        // write your code here
        String[] students = {"Christian", "Michael", "Camila", "Sienna", "Tanya", "Connor", "Zachariah", "Mallory", "Zoe", "Emily"};
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hay nhap ten can tim kiem : ");
        String nameInput=scanner.nextLine();
        boolean check=false;
        for (int i = 0; i < students.length; i++) {
            if (students[i].equalsIgnoreCase(nameInput)){
                check=true;
                System.out.println("Ten tim kiem "+nameInput + "\t"+"o vi tri :"+(i+1));
                return;
            }else  check=false;
        }
        if (!check) {
            System.out.println("Khong tim thay tu"+ "\t"+nameInput+ "\t"+"can tim kiem ! ");
        }
    }
}
