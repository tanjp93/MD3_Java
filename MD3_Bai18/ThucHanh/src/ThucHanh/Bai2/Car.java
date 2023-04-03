package ThucHanh.Bai2;

import java.io.Serializable;
import java.util.Random;

import static ThucHanh.Bai2.Main.DISTANCE;
import static ThucHanh.Bai2.Main.STEP;


public class Car implements Runnable {
    private String name;

    public Car(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        int runDistance = 0;
        long startTime = System.nanoTime();
        while (runDistance <= DISTANCE) {
            int velocity=(int)(Math.random()*20);
            runDistance+=velocity;
            String log="|";
            for (int i = 0; i < DISTANCE; i+=STEP) {
                if (runDistance>=i+STEP){
                    log+="=";
                }else if (runDistance>=i&&runDistance<=i+STEP){
                    log+="o";
                }else {
                    log+="-";
                }
            }
            log+="|";
            int display= (runDistance<DISTANCE)? runDistance: DISTANCE;
            System.out.println("Car " + name + log + display + "KM");
        }
        long endTime=System.nanoTime();
        System.out.println("Total car "+name+" driving time is :"+(endTime-startTime)+"ms");

    }
}
