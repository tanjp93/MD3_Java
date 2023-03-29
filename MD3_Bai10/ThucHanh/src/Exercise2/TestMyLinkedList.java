package Exercise2;

import java.lang.reflect.Array;
import java.util.Arrays;

public class TestMyLinkedList {
    public static void main(String[] args) {
        System.out.println("/=/=/=/= TESTING /=/=/=/=");
        MyLinkedList ll = new MyLinkedList(10);
        System.out.println(ll);
        System.out.println("--------------------------");
        ll.addFirst(11);
        ll.addFirst(12);
        ll.addFirst(13);
        ll.addFirst(14);
        ll.addFirst(15);
        System.out.println("ll index = 0 is "+ ll.get(0));
        System.out.println("ll index = 1 is "+ ll.get(1));
        System.out.println("ll index = 2 is "+ ll.get(2));
        System.out.println("ll index = 3 is "+ ll.get(3));
        System.out.println("ll index = 4 is "+ ll.get(4));
        System.out.println("ll index = 5 is "+ ll.get(5));
    }

}
