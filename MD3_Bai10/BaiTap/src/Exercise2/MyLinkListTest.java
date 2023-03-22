package Exercise2;

import java.util.LinkedList;

public class MyLinkListTest {
    public static void main(String[] args) {
        MyLinkList myLinkedListTest = new MyLinkList(10);
        myLinkedListTest.addLast(2);
        myLinkedListTest.addFirst(1);
        myLinkedListTest.add(1,3);
        System.out.println("Index of 3 : "+myLinkedListTest.indexOf(3));
        System.out.println("clone colection : " +myLinkedListTest.clone());
        System.out.println("list contain number 3: " +myLinkedListTest.contains(3));
        System.out.println("list size : " +myLinkedListTest.size());
        System.out.println("remove element 3 index 1 :"+myLinkedListTest.remove(3));
        System.out.println("list size : " +myLinkedListTest.size());
        myLinkedListTest.printList();
    }
}
