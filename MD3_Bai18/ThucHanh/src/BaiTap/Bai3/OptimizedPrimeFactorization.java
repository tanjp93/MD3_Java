package BaiTap.Bai3;

import java.util.ArrayList;
import java.util.List;

import static BaiTap.Bai3.Main.numLimited;

public class OptimizedPrimeFactorization implements Runnable{
    @Override
    public synchronized void run() {
        long startTime=System.nanoTime();
        int numLimit = numLimited;
        boolean check=true;
        List<Integer> listPrimes = new ArrayList<>();

        if (numLimit < 2) {
            listPrimes = null;
            System.out.println("Prime number was not found !");
            return;
        } else if (numLimit == 2) {
            System.out.println("Prime number is 2");
            return;
        } else {
            listPrimes.add(2);
            for (int i = 3; i <= numLimit; i++) {
                for (int j = 2; j < (int)Math.sqrt(i); j++) {
                    if (i % j == 0) {
                        check=false;
                        break;
                    }else check=true;
                }
                if (check){
                    listPrimes.add(i);
                }
            }
        }
        System.out.println();
        System.out.print (Thread.currentThread().getName()+" Prime number is : ");
        for (Integer num:listPrimes) {
            System.out.print(num+" ");
        }
        long endTime=System.nanoTime();
        long timeProcess=endTime-startTime;
        System.out.println("Process time :" +timeProcess);
        System.out.println();
    }
}
