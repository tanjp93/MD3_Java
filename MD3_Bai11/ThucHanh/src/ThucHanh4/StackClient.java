package ThucHanh4;

public class StackClient {
    public static void main(String[] args) throws Exception{
        MyStack stack = new MyStack(5);

        stack.push(5);
        stack.push(4);
        stack.push(3);
        stack.push(2);
        stack.push(1);

        System.out.println("1. Size of stack after push operations: " + stack.size());
//        System.out.printf("2. Pop elements from stack : ");
System.out.println("Stack Element: " + stack.toString());
        System.out.println(stack.pop());
//
        System.out.println("Stack Element: " + stack.toString());
//
//        System.out.println("\n3. Size of stack after pop operations : " + stack.size());

    }
}
