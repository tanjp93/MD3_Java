package Bai3;

public class Solution extends Queue {
    public Solution() {
    }

    public void enQueue(int data) {
        Node newNode = new Node(data);
        if (front == null) {
            front = rear = newNode;
        } else {
            rear.link = newNode;
            rear = newNode;
        }
    }

    public int deQueue() {
        Node temp = front;
        if (front == null) {
            System.out.println("Under Flow");
        } else {
            front=front.link;
        }
        return temp.data;
    }

    public void displayQueue() {
        Node temp = front;
        while (temp != null) {
            System.out.print(temp.data);
            temp = temp.link;
        }
    }

    @Override
    public String toString() {
        return "Solution{} " + super.toString();
    }
}