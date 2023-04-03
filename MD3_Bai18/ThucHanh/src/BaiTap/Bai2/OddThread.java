package BaiTap.Bai2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class OddThread extends Thread {
    @Override
    public void run() {
        List<Integer> lisOddThread = new ArrayList<>();
        try {
            for (int i = 0; i < 10; i++) {
                if (i % 2 != 0) {
                    Thread.sleep(15);
                    lisOddThread.add(i);
                }
            }
        } catch (InterruptedException e) {
            System.err.println("Unavailable");
        }
        System.out.print(Thread.currentThread().getName());
        for (Integer num:lisOddThread ) {
            System.out.print( " "+num);
        }
        System.out.println();
    }
}
