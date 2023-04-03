package BaiTap.test;

class MyThread extends Thread {
    @Override
    public void run(){
        System.out.println("MyThread working...");
    }
}

class Main {
    public static void main(String[] args){
        MyThread mt = new MyThread();
        mt.setName("MyThread");
        mt.start();
        System.out.println("Main Thread");
        System.out.println("Is " + mt.getName()
                + " a Daemon Thread: "
                + mt.isDaemon());
        System.out.println("Is " + Thread.currentThread().getName()
                + " a Daemon Thread: "
                + Thread.currentThread().isDaemon());
    }
}