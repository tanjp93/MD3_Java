package Exercise2;

import java.util.Arrays;
import java.util.LinkedList;

public class MyLinkList {
    private int numNode=0;
    private Node head;

    public MyLinkList() {
    }

    public MyLinkList(Object data) {
        head=new Node(data);
    }

    private class Node{
        private Node next;
        private Object data;

        public Node() {
            this.next = null;
        }
        public Node(Object data) {
            this.data = data;
        }
        public Object getData(){
            return this.data;
        }

        @Override
        public String toString() {
            return "Node{" +
                    "next=" + next +
                    ", data=" + data +
                    '}';
        }
    }
    public  void  add (int index,Object data){
        Node temp =head;
        Node holder;
        for (int i = 0; i <index-1&& temp.next!=null ; i++) {
            temp=temp.next;
        }
        holder=temp.next;
        temp.next=new Node(data);
        temp.next.next=holder;
        numNode++;
    }
    public void addFirst(Object data){
        Node temp=head;
        head=new Node(data);
        head.next=temp;
        numNode++;
    }
    public void addLast(Object data){
        Node temp=head;
        Node lastElement=new Node(data);
        while (temp.next!=null){
            temp=temp.next;
        }
        temp.next=lastElement;
        numNode++;
    }

    public int size(){
        return ++numNode;
    }
    public Object clone(){
        Node newList=new Node(head.data);
        Node temp=head;
        newList.next=temp.next;
        return newList;
    };
    public int indexOf(Object data){
        int index=0;
        Node temp=head;
        Node checkValue=new Node(data);
        while(temp.data!=checkValue.data){
            if (temp.data!=null){
            index++;
            temp=temp.next;
            } else break;
        }
        return index;
    }
    public Object  remove(Object data){
        Node removeValue=new Node(data);
        Node temp=head;
        while (temp.next.data!=removeValue.data){
            temp=temp.next;
        }
        Node result=temp.next;
        Node holder=temp.next.next;
        temp.next = holder;
        numNode--;
        return result;
    }
    public Node get(int index) {
        Node temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        return temp;
    }
    public void printList(){
        Node temp=head;
        while (temp!=null){
            System.out.println(temp.data);
            temp= temp.next;
        }
    }
    public boolean contains(Object data){
//        Node checkElement=new Node(data);
        boolean checkContain=false;
        Node temp=head;
        while (temp.next!=null){
            if (temp.data!=data){
                temp=temp.next;
                checkContain=false;
            } else {
                checkContain=true;
                break;
            }
        }return checkContain;
    }
    @Override
    public String toString() {
        return "MyLinkList{" +
                "numNode=" + numNode +
                ", head=" + head +
                '}';
    }
}
