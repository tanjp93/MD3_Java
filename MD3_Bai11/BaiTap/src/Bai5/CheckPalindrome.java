package Bai5;

import java.util.LinkedList;
import java.util.Queue;


public class CheckPalindrome {
    public static void main(String[] args) {
        String initialStr = "Able was I ere I saw Elba";
        String[] strKey = initialStr.split("");

        Queue<String> reverseStr = new LinkedList<>();
        for (int i = strKey.length - 1; i >= 0; i--) {
            reverseStr.add(strKey[i]);
        }
        String newArr="";
        while(!reverseStr.isEmpty()){
            newArr+= reverseStr.poll();
        }
        if (newArr.toLowerCase().equals(newArr.toLowerCase())){
            System.out.println("Your array is a Palindrome array!");
        }else System.out.println("Your array is not a Palindrome array!");
    }
}