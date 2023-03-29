package Bai6;

import java.util.Stack;

public class CheckBracket {
    public static void main(String[] args) {
        String[] expression = {"s * (s – a) * (s – b) * (s – c)",
                "(– b + (b2 – 4*a*c)^0.5) / 2*a",
                "s * (s – a) * (s – b * (s – c)",
                "s * (s – a) * s – b) * (s – c)",
                "(– b + (b^2 – 4*a*c)^(0.5/ 2*a))"};
        for (int i = 0; i < expression.length; i++) {
            Stack<Character> bracketLeft = new Stack<>();
            Stack<Character> bracketRight = new Stack<>();
            for (int j = 0; j < expression[i].length(); j++) {
                if (expression[i].charAt(j) == '(') {
                    bracketLeft.push('(');
                }
                if (expression[i].charAt(j) == ')') {
                    bracketRight.push(')');
                }
            }
            if (bracketRight.size() == bracketLeft.size()) {
                System.out.println(expression[i] + " : Bieu thuc dung !");
            } else System.out.println(expression[i] + " : Bieu thuc sai !");
        }
    }
}
