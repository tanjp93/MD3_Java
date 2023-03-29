package Exercise1;

import java.util.ArrayList;
import java.util.Arrays;

public class MyListTest {
    public static void main(String[] args) {
        MyList<Integer> myListTest=new MyList<>();

        for (int i = 0; i <15 ; i++) {
            myListTest.add(i);
            System.out.println("Element "+i +"  "+myListTest.getElement(i));
        }
        System.out.println("--------------------------------------");
        System.out.println("MyListTest is "+myListTest);
        System.out.println("--------------------------------------");
        System.out.println("Index of Element 3 is "+myListTest.indexOf(3));
        System.out.println("--------------------------------------");
        System.out.println("Element 11 is in List ? "+myListTest.contains(11));
        System.out.println("--------------------------------------");
        System.out.println("Element 's size is? "+myListTest.size());
    }
}
