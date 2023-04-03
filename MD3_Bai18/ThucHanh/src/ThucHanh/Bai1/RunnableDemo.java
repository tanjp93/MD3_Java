package ThucHanh.Bai1;

public class RunnableDemo implements Runnable {
    private Thread thread;
    private String threadName;

    public RunnableDemo(String threadName) {
        this.threadName = threadName;
    }

    public Thread getThread() {
        return thread;
    }

    public void setThread(Thread thread) {
        this.thread = thread;
    }

    public String getThreadName() {
        return threadName;
    }

    public void setThreadName(String threadName) {
        this.threadName = threadName;
    }

    @Override
    public void run() {
        System.out.println("Running ---------");
        for (int i = 0; i < 10; i++) {
            System.out.println("Thread : "+threadName+ " , "+i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
    public  void start(){
        if (thread==null){
            thread=new Thread(this,threadName);
            thread.start();
        }
    }
}