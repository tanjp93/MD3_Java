package Exercise2;

public class MyLinkedList {
    private Node head;
    private int numNodes;
    private Node next;
    private Object data;

    public MyLinkedList(Object data) {
        head = new Node(data);
    }

    private class Node {

        private Node next;
        private Object data;
        public Node(Object data) {
            this.data = data;
        }

        public Object getData() {
            return this.data;
        }

        @Override
        public String toString() {
            return "Node{" +
//                   " head ="+head+
                    "next=" + next +
                    ", data=" + data +
                    '}';
        }
    }

    public void add(int index, Object data) {
        Node temp = head;
        Node holder;
        for (int i = 0; i < index - 1 && temp.next != null; i++) {
            temp = temp.next;
        }
        holder = temp.next;
        temp.next = new Node(data);
        temp.next.next = holder;
        numNodes++;
    }

    public void addFirst(int data) {
        Node temp = head;
        head = new Node(data);
        head.next = temp;
        numNodes++;
    }

    public Node get(int index) {
        Node temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        return temp;
    }

    @Override
    public String toString() {
        return "Node{" +
//                " head ="+head+
                "next=" + next +
                ", data=" + data +
                '}';
    }
};