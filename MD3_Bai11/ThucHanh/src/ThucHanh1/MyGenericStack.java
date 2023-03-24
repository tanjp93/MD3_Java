package ThucHanh1;

import java.util.EmptyStackException;
import java.util.LinkedList;

public class  MyGenericStack <T> {
   private LinkedList stack;
    public MyGenericStack() {
        stack=new LinkedList<T>();
    }
    public void push (T element){
        stack.addFirst(element);
    }
    public boolean isEmpty(){
        if(stack.size()==0){
            return true;
        }else return false;
    }
    public int size(){
        return stack.size();
    }
    public T pop(){
        if(isEmpty()){
            throw  new EmptyStackException();
        }
        return (T) stack.removeFirst();
    }

    @Override
    public String toString() {
        return "MyGenericStack{" +
                "stack=" + stack +
                '}';
    }
};
