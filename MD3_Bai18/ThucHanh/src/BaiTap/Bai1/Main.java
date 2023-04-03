package BaiTap.Bai1;

public class Main {
    public static void main(String[] args) {
        NumberGenerator ng1 = new NumberGenerator();
        NumberGenerator ng2 = new NumberGenerator();
        Thread t1=new Thread(ng1,"t1");
        Thread t2=new Thread(ng2,"t2");
        t1.setPriority(1);
        t2.setPriority(2);
        t1.start();
        t2.start();
    }
}
