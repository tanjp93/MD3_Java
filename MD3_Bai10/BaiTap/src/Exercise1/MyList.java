package Exercise1;

import java.util.Arrays;

public class MyList <E>{
    private int size=0;
    private final int DEFAULT_CAPACITY=10;
    private final Object[] EMPTY_ELEMENTDATA={};
    private Object elements[];
    public MyList() {
     elements=new Object[DEFAULT_CAPACITY];
    }
    public MyList(int capacity ) {
        if(capacity>0){
        elements=new Object[capacity];
        }else {if (capacity==0){
            elements=EMPTY_ELEMENTDATA;
        }else {
            throw new IllegalArgumentException("Illegal Capacity" +capacity);
        }
        }
    }
    public void ensureCapacity(int minCapacity){
        if (minCapacity<0){
            throw new IndexOutOfBoundsException(" minCapacity : " +minCapacity+ " is not exception .");
        }else  {
            int newSize=minCapacity+size;
            elements = Arrays.copyOf(elements,newSize);
            System.out.println("size ---->" + size);
        }
    }

    void add (int index, E element){
        if (index> size|| index<0){
            throw new IndexOutOfBoundsException("Index : "+index+" ,Size "+index);
        }
        if (size== elements.length){
            ensureCapacity(1);
            for (int i = elements.length-1; i >index ; i--) {
                elements[i]= elements[i-1];
            }
            elements[index]=element;
        }
    };
    public E remove(int index){
        if (index>size|| index<0){
            throw new IndexOutOfBoundsException("Index: " + index + ", Size " + index );
        }
        Object temp=elements[index];
        for (int i = elements.length-1; i >index; i++) {
            elements[i]=elements[i-1];
        }
        elements=Arrays.copyOf(elements,elements.length-1);
                return (E) temp;
    };


    public  int size(){
        for (int i = 0; i < elements.length; i++) {
           if (elements[i]==null){
               size=i+1;
           }
           else size= elements.length;
        }
        return size;
    }
    public  E clone(){
        Object[] temp =Arrays.copyOf(elements,elements.length);
        return (E) temp;
    }
    public boolean contains (E element){
        boolean check=false;
        for (int i = 0; i <elements.length ; i++) {
            if (elements[i]==element){
                check=true;
                break;
            }else check=false;
        }
        return check;
    }
    public int  indexOf (E element){
        for (int i = 0; i <elements.length ; i++) {
            if (elements[i]==element){
                return i;
            }
        }
        return -1;
    }
    public boolean add(E element){
            if (size==elements.length){
                ensureCapacity(1);
//                size++;
            };
            elements[size++]= element;
        System.out.println(size);
        return true;
    };

    public E getElement(int i){
        if(i>=size||i<0){
            throw new IndexOutOfBoundsException("Index : "+i+ " ,Size  "+i);
        }
        return (E) elements[i];
    }
    void  clear(){
        for (int i = 0; i < elements.length; i++) {
            elements[i]=null;
        }
    }

    @Override
    public String toString() {
        return "MyList{" +
                "size=" + size +
                ", DEFAULT_CAPACITY=" + DEFAULT_CAPACITY +
                ", elements=" + Arrays.toString(elements) +
                '}';
    }
}
