package ThucHanh.test2;

public class TestThread extends Thread{
    private String testThreadName;

    public TestThread(String testThreadName) {
        this.testThreadName = testThreadName;
    }

    public String getTestThreadName() {
        return testThreadName;
    }

    public void setTestThreadName(String testThreadName) {
        this.testThreadName = testThreadName;
    }

    @Override
    public void run() {
        for (int i = 0; i <10 ; i++) {
            System.out.println(testThreadName +">>>"+" "+i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public static void main(String[] args) {
        TestThread t1=new TestThread("A");
        TestThread t2=new TestThread("B");
        t1.start();
        t2.start();
    }
}
