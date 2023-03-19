package SinglyLinkedList;

public class CountNodes {
    class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }

        @Override
        public String toString() {
            return "Node{" +
                    "data=" + data +
                    ", next=" + next +
                    '}';
        }
    }

    public Node head, tail, test1, test2;

    @Override
    public String toString() {
        return "CountNodes{" +
                "head=" + head +
                ", tail=" + tail +
                '}';
    }

    public void addNode(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
//            System.out.println(head);
//            System.out.println(tail);
            tail.next = newNode;
//            System.out.println(head);
//            System.out.println(tail);
            tail = newNode;
        }
        ;
    }
    public void display(){
        Node current=head;
        if (head==null){
            System.out.println("Danh sách trống ! ");

        }else {
            System.out.println("Cac Node trong Singly Linked List: ");
            while (current!=null){
                System.out.print(current.data+ " ");
                current=current.next;
            }
        }
        System.out.println();
    }
    public int countNodes() {
        int count = 0;
        Node current = head;
        while (current != null) {
            count++;
            current = current.next;
        }
        return count;
    }
}
