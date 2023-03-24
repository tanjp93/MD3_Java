package ThucHanh2;

public class Node {
    private int key;
    Node next;

    public Node(int key) {
        this.next=null;
        this.key=key;
    }

    @Override
    public String toString() {
        return "Node{" +
                "key=" + key +
                ", next=" + next +
                '}';
    }
}
