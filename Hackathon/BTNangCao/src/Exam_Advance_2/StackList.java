package Exam_Advance_2;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

public class StackList {
    public static void main(String[] args) {

        Stack<String>stringStack=new Stack<>();
        Scanner scanner=new Scanner(System.in);
        System.out.println("Nhap tu thu 1 : ");
        String text1=scanner.nextLine();
        System.out.println("Nhap tu thu 2: ");
        String text2=scanner.nextLine();
        System.out.println("Nhap tu thu 3: ");
        String text3=scanner.nextLine();
        stringStack.push(text1);
        stringStack.push(text2);
        stringStack.push(text3);
        System.out.println(stringStack);
        ArrayList <String> reverseList=new ArrayList<>();
        while (!stringStack.isEmpty()){
            reverseList.add(stringStack.pop()) ;
        }
        System.out.println(reverseList);
    }
}
