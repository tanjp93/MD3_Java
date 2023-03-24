package Bai4;

import java.util.Stack;

public class TestBinary {
    public static void main(String[] args) {
        int number=111;
        Stack<Integer>tempArr=new Stack<>();
        Stack<Integer>toBinary=new Stack<>();
        int binaryNumber;
        while (number!=0){
            binaryNumber=number%2;
            tempArr.push(binaryNumber);
            number=number/2;
        }
        while (!tempArr.isEmpty()){
            int tempNumber=tempArr.pop() ;
            toBinary.push(tempNumber);
        }
        for (Integer element: toBinary ) {
            System.out.print(element);
        }
    }
}
