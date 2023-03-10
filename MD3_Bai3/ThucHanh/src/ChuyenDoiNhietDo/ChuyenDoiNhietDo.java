package ChuyenDoiNhietDo;

import java.util.Scanner;

public class ChuyenDoiNhietDo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double fahrenheit;
        double celsius;
        int choise = -1;
        do {
            System.out.println(" Menu .");
            System.out.println(" 0. Exit");
            System.out.println(" 1. Fahrenheit to Celsius");
            System.out.println(" 2. Celsius to Fahrenheit");
            System.out.println(" Enter your choice: ");
            choise = sc.nextInt();
            switch (choise) {
                case 1:
                    System.out.println("Nhap nhiet do Fahrenheit :");
                    fahrenheit = sc.nextDouble();
                    celsius=F_to_C(fahrenheit);
                    System.out.println("Nhap nhiet do celsius : "+ celsius);
                    choise = -1;
                    break;
                case 2:
                    System.out.println("Nhap nhiet do Celsius :");
                    celsius = sc.nextDouble();
                    fahrenheit=C_to_F(celsius);
                    System.out.println("Nhiet do fahrenheit : "+ fahrenheit);
                    choise = -1;
                    break;
            }
        } while (choise == -1);
    }
    public static double F_to_C (double fahrenheit){
          double celsius=(5.0 / 9) *(fahrenheit-32);
        return celsius;
    }
    public  static  double C_to_F(double celsius){
        double fahrenheit = (9.0 / 5) * celsius + 32;
        return fahrenheit;
    }
}
