package ThucHanh.test;

public class Main {
    public static void main(String[] args) {
//        MyThread t1=new MyThread();
//        MyThread t2=new MyThread();
//        t1.setName("T1");
//        t1.setName("T2");
//        t1.start();
//        t2.start();
        Account account=new Account();
        Thread acc1=new Thread(account);
        Thread acc2=new Thread(account);
        Thread acc3=new Thread(account);
        acc1.start();
        acc2.start();
        acc3.start();
    }
}
