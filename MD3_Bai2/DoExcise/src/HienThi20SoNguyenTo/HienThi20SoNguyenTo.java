package HienThi20SoNguyenTo;

public class HienThi20SoNguyenTo {
    public static void main(String[] args) {

            int count = 1;
            int i;
            int n = 3;
            boolean check = false;
            String soNguyenTo = "2";
            while (count < 20) {
                for (i = 2; i < n; i++) {
                    if (n % i == 0) {
                        check =false;
                        break;
                    } else
                        check = true;
                }
                if (check) {
                    soNguyenTo =soNguyenTo+ "-" +n;
                    count++;
                }
                n++;
            }
            System.out.println("20 so nguyen to dau tien bao gom " + soNguyenTo);
    }
}
