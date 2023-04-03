package ThucHanh.Bai3;

public class Count implements Runnable {
    private Thread myThread;

    public Count() {
        myThread=new Thread(this,"my runnable thread");
        System.out.println("my thread created " + myThread);
        myThread.start();
    }

    public Thread getMyThread() {
        return myThread;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Printing the count "+i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println("my thread rung is over !");
    }
}
