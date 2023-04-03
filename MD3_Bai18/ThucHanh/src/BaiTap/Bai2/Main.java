package BaiTap.Bai2;

public class Main {
    public static void main(String[] args) {
        //so le
        OddThread oddThread=new OddThread();
        oddThread.setName("oddThread");

        //so chan
        EvenThread eth=new EvenThread();
        Thread evenThread=new Thread(eth,"evenThread");
        //chay
        oddThread.start();
        evenThread.start();
    }
}
