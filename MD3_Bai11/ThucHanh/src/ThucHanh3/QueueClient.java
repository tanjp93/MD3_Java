package ThucHanh3;

public class QueueClient {
    public static void main(String[] args) {
        MyQueue queue=new MyQueue(4);
        queue.enqueue(4);
        queue.enqueue(98);
        queue.enqueue(45);
        queue.enqueue(23);
        System.out.println(" list >>>>>>>>>>>>>"+queue);
        queue.dequeue();
        System.out.println(" list >>>>>>>>>>>>>"+queue);
    }
}
