package Exam_Advance_3;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class ListRegisterParent {
    public static void main(String[] args) {
        Queue<String> ListRegisterParent = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);
        int choice;
        while (true) {
            System.out.println("chon lua");
            System.out.println("1. Tiep tuc nhap");
            System.out.println("2. In phụ huynh đầu tiên trong danh sách và xóa phụ huynh vừa in");
            System.out.println("3. Thoat chuong trinh");
            choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {

                case 1:
                    System.out.println("Nhap ten phu huynh :");
                    String nameParent=scanner.nextLine();
                    ListRegisterParent.add(nameParent);
                    break;
                case 2:
                    System.out.println("phụ huynh đầu tiên trong danh sách"+ListRegisterParent.poll());
                    break;
                case 3:System.exit(0);
                    break;
                default:throw new IndexOutOfBoundsException("Nhap lai");
            }

        }

    }

}
