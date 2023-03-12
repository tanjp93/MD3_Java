package ThietKeLopFan;

import java.util.Scanner;

public class Baitap3 {
    public static void main(String[] args) {
        Fan fanInitial = new Fan();
        System.out.println(fanInitial.display());

        Scanner sc = new Scanner(System.in);
        boolean status = false;
        int turn;
        do {
            System.out.println("0 .Nhan 0 de tat quat !");
            System.out.println("1 .Nhan 1 de bat quat!");
            turn = sc.nextInt();
            if (turn != 0 && turn != 1) {
                System.out.println("Please input number again !");
            } else if (turn == 0) {
                status = false;
            } else status = true;
        } while (turn != 0 && turn != 1);


        System.out.println("Nhap toc do !");
        System.out.println("1.toc do thap !");
        System.out.println("2.toc do trung binh !");
        System.out.println("3.toc do cao !");
        int speed = sc.nextInt();
        if (speed > 3 || speed < 1) {
            System.out.println("Yeu cau nhap lai toc do !");
        }
        System.out.println("Nhap ban kinh quat !");
        double radius = sc.nextDouble();
        if (radius < 0) {
            System.out.println("Nhap lai ban kinh quat !");
        }
        System.out.println("Nhap mau sac cua quat !");
        System.out.println("1.Blue");
        System.out.println("2.Yellow");
        System.out.println("3.Green");
        System.out.println("4.White");
        int colorNo = sc.nextInt();
        String color;
        if (colorNo > 4 || colorNo < 1) {
            System.out.println("Nhap dinh dang ko chinh xac !");
        } else {
            switch (colorNo) {
                case 1:
                    color = "Blue";
                    break;
                case 2:
                    color = "Yellow";
                    break;
                case 3:
                    color = "Green";
                    break;
                case 4:
                    color = "White";
                    break;
                default:
                    color = "Blue";
                    break;
            }

            Fan fanSetting = new Fan(speed, status, radius, color);
            fanSetting.display();
            System.out.println(fanSetting.display());
        }
    }
}
