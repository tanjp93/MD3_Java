package lopStopWatch;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class StopWatch {
    public static void main(String[] args) {
        long start, end;
        start =System.nanoTime();//Lay thoi gian !
        for (int i=0;i<100;i++);
        end=System.nanoTime();
        System.out.println("Tieme Nano :"+ (end-start));
         start=System.currentTimeMillis();
         for (long i=0;i<100000000;i++);
         end =System.currentTimeMillis();
        System.out.println("Time Millis :" + (end-start));

        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        // tạo 1 đối tượng có định dạng thời gian yyyy-MM-dd HH:mm:ss
        Date date = new Date(); // lấy thời gian hệ thống
        String stringDate = dateFormat.format(date);//Định dạng thời gian theo trên
        System.out.println("Date: " + stringDate);
    }
}
