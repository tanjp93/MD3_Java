package Exercise1;

import java.util.Arrays;

public class MyList {
    int size=0;
    static  final  int DEFAULT_CAPACITY=10;
    Object elements[];

    public MyList() {
        elements=new Object[DEFAULT_CAPACITY];
    };

    public MyList(int capacity) {
        elements = new Object[capacity];
    }
    public E remove(int index){
        if (index>=size||index<0){
            throw new IndexOutOfBoundsException("Index : " +index + ", Size :"+index);
        }
        Object temp=elements[index];
        for (int i =index;i<elements.length-1; i++){
        elements[i]=elements[i+1];
        }
}
