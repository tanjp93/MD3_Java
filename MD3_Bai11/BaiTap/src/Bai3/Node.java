package Bai3;

public class Node {
    int data;
     Node link;

    public Node() {
        Node link=null;
    }
    public Node(int data) {
        this.data=data;
        this.link=null;
    }

    @Override
    public String toString() {
        return "Node{" +
                "data=" + data +
                ", link=" + link +
                '}';
    }
}
