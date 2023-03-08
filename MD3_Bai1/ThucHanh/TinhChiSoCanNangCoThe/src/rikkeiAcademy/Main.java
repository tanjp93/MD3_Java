package rikkeiAcademy;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Hay nhap can nang :");
            double weight = sc.nextDouble();
            System.out.println("Hay nhap chieu cao :");
            double height = sc.nextDouble();
            String result;
            if (weight > 0 && height > 0) {
                double bmi = weight /(height*height);
                if (bmi < 18.5) {
                    result = "Ban qua gay!";
                } else {
                    if (bmi < 25) {
                        result = "Than hinh hoan hoa!";
                    } else {
                        if (bmi < 30.0) {
                            result = "Ban hoi map can giam can!";
                        } else {
                            result = "Ban qua map can giam can gap!";
                        }
                    }
                }
                System.out.println(result + " BMI =" +bmi);
            }
            else System.out.println("Vui long nhap lai chi so ! ");
        }
    }
}
