package BaiTap.Bai2;

import java.util.ArrayList;
import java.util.List;

public class EvenThread implements Runnable {

    @Override
    public void run() {
        List<Integer> lisEvenThread = new ArrayList<>();
        try {
            for (int i = 0; i < 10; i++) {
                if (i % 2 == 0) {
                    Thread.sleep(10);
                    lisEvenThread.add(i);
                }
            }
        } catch (InterruptedException e) {
            System.err.println("Unavailable");
        }
        System.out.print(Thread.currentThread().getName());
        for (Integer num : lisEvenThread) {
            System.out.print(" "+num );
        }
        System.out.println();
    }
}
