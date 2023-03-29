package ThucHanh4;

import java.util.Arrays;

public class MyStack {
    private int[]arr;
    private  int size;
    private int index=0;

    public MyStack(int size) {
        this.size = size;
        arr=new int[size];
    }
    public void push(int element){
        if(isFull()){
            throw new StackOverflowError("Stack is full");
        }
        arr[index]=element;

        index++;
    }
    public int pop() throws Exception {
        if (isEmpty()) {
            throw new Exception("Stack is null");
        }{
        return arr[--index];
        }
    }

    public int size(){
        return size;
    }
    public boolean isEmpty(){
        boolean check=false;
        if (size==0){
             check=true;
        }else  check=false;
        return check;
    }
    public boolean isFull(){
        if (index == size) {
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "MyStack{" +
                "arr=" + Arrays.toString(arr) +
                ", size=" + size +
                ", index=" + index +
                '}';
    }
}
