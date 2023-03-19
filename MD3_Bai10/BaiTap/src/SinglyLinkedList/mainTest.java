package SinglyLinkedList;

public class mainTest {
    public static void main(String[] args) {
        CountNodes sList=new CountNodes();
        System.out.println(sList);
        sList.addNode(1);
        System.out.println(sList);
        sList.addNode(2);
        System.out.println(sList);
        sList.addNode(3);
        System.out.println(sList);
//        sList.addNode(4);
//        System.out.println(sList);
//        sList.addNode(5);
//        System.out.println(sList);

        sList.display();
        System.out.println("Số node đếm được là : "+sList.countNodes());
        System.out.println(sList);
    }
}
