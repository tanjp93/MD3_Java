package ThucHanh.Test3;

public class TestThread implements Runnable{
    public int tong;

    public TestThread() {
        this.tong = 1000;
    }
    public synchronized void rutTien() throws InterruptedException {
        if (tong>0){
            Thread.sleep(1000);
            tong=tong-1000;
            System.out.println(tong);
        }else {
            System.out.println("Khong con tien de rut !");
        }
    }
    @Override
    public void run() {
        try {
            rutTien();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) {
        TestThread t=new TestThread();
        Thread t1=new Thread(t);
        Thread t2=new Thread(t);
        System.out.println(" Thread t1  ");
        t1.start();
        System.out.println(" Thread t2  ");
        t2.start();
    }
}
