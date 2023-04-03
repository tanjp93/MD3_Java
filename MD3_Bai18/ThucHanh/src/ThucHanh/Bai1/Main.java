package ThucHanh.Bai1;

public class Main {
    public static void main(String args[]) {
        RunnableDemo t1=new RunnableDemo("testA");
        RunnableDemo t2=new RunnableDemo("testB");

        t1.start();
        t2.start();
    }
}
