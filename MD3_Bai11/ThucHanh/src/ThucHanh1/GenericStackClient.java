package ThucHanh1;

public class GenericStackClient {
    public static void main(String[] args) {
//        System.out.println("1. Stack of integers");
//        stackOfIString();
        System.out.println("\n2. Stack of Strings");
        stackOfIntegers();
    }
    private static void stackOfIString(){
        MyGenericStack<String> stack=new MyGenericStack();
        stack.push("Five");
        stack.push("Four");
        stack.push("Three");
        stack.push("Two");
        stack.push("One");
        System.out.println("1.1 Size of stack before push operation : "+ stack.size());;
        System.out.println("1.2 Pop elements from stack : "+ stack.pop());
        System.out.println();
    }


    private static void stackOfIntegers(){
        MyGenericStack<Integer> stack=new MyGenericStack();
        stack.push(5);
        stack.push(4);
        stack.push(3);
        stack.push(2);
        stack.push(1);
        System.out.println("2.1 Size of stack before push operation : "+stack.size());
        System.out.printf("2.2. Pop elements from stack : "+stack.pop());
        System.out.println("\n3.3 Size of stack after pop operations : " + stack.size());
        System.out.println("\n3.3 Size of stack after pop operations : " + stack);
    }

}
