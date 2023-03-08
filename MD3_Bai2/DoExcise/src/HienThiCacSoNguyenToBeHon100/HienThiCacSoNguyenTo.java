package HienThiCacSoNguyenToBeHon100;

public class HienThiCacSoNguyenTo {
    public static void main(String[] args) {
        int n=3;
        int i;
        boolean check=false;
        String soNguyenTo="2";
        while (n<100){
            for (i=2;i<=Math.sqrt(n);i++){
                if (n%i==0){
                    check=false;
                    break;
                }else check=true;
            }
            if (check){
                soNguyenTo+= ";"+n;
            }
            n++;
        }
        System.out.println("Day so nguyen to be hon 100 :"+soNguyenTo);
    }
}
