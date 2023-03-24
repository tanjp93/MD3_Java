package Bai1;

import java.util.Stack;

public class ReverseArrClient {

    public static void main(String[] args) {
        Stack<Integer> intArr = new Stack<>();
        intArr.push(1);
        intArr.push(2);
        intArr.push(3);
        intArr.push(4);
        intArr.push(5);
        System.out.println(intArr);
        Stack<Integer> tempArr = new Stack<>();
        while(!intArr.isEmpty()){
        tempArr.push(intArr.pop());
        }
        System.out.println(tempArr);
    }

}
