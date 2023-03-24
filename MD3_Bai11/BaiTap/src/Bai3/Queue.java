package Bai3;

public class Queue {
     Node front;
     Node rear;

    public Queue() {
        front = null;
        rear = null;
    }
    public Node getFront() {
        return front;
    }

    public void setFront(Node front) {
        this.front = front;
    }

    @Override
    public String toString() {
        return "Queue{" +
                "front=" + front +
                ", rear=" + rear +
                '}';
    }
}
