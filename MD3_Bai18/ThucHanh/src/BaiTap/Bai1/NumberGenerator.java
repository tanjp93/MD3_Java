package BaiTap.Bai1;

 public class NumberGenerator implements Runnable{
    @Override
    public   void run() {
        int length=10;
        for (int i = 0; i < length; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName()+"Number "+ i+"-hashCode-"+hashCode());

        }
    }
}
