package Bai3;

public class Test {
    public static void main(String[] args) {
        Solution solution = new Solution();
        solution.enQueue(5);
        solution.enQueue(10);
        solution.enQueue(11);
        solution.enQueue(12);
        solution.enQueue(13);
        solution.enQueue(15);
        System.out.println("Truoc khi deQueue : "+ solution);
        System.out.println( "So bi xoa : "+solution.deQueue());
        System.out.println("Sau khi deQueue : "+ solution);
    }
}
