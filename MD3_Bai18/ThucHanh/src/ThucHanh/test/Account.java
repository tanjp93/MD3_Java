package ThucHanh.test;

public class Account implements Runnable {
    private int balance = 5000;

    @Override
    public void run() {
        withdraw();
    }

    private void withdraw() {
        try {
            balance = balance - 1000;
            System.out.println(Thread.currentThread().getName());
            Thread.sleep(3000);
            if (balance < 0) {
                System.out.println("Het Tien");
            } else System.out.println("OK!");
        } catch (
                InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
