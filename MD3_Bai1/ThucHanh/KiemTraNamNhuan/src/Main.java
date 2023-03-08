import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hay nhap so nam : ");
        while (true) {
            int year = scanner.nextInt();
            String result = (year % 4 == 0) ? year % 100 != 0 ? "la nam nhuan!" : year % 400 != 0 ? "khong phai la nam nhuan!" : "la nam nhuan!" : "khong phai la nam nhuan!";
//            if (year % 4 == 0) {
//                if (year % 100 != 0) {
//                    result = "la nam nhuan!";
//                } else {
//                    if (year % 400 != 0) {
//                        result = "khong phai la nam nhuan!";
//                    } else result = "la nam nhuan!";
//                }
//            } else result = "khong phai la nam nhuan!";
            System.out.println(year + " " + result);
        }
    }
}
