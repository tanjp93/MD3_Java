package Exercise1;

public class MyListTest {
    public static void main(String[] args) {
        MyList<Integer> listInteger = new MyList<Integer>();
        listInteger.add(1);
        listInteger.add(2);
        listInteger.add(3);
        listInteger.add(4);
        listInteger.add(5);
        System.out.println("Element 1 is " + listInteger.get(0));
        System.out.println("Element 2 is " + listInteger.get(1));
        System.out.println("Element 3 is " + listInteger.get(2));
        System.out.println("Element 4 is " + listInteger.get(3));
        System.out.println("Element 5 is " + listInteger.get(4));
//        listInteger.get(6);
//        System.out.println("element 6 : "+ listInteger.get(6));
//        listInteger.get(-1);
//        System.out.println("Element -1 is "+listInteger.get(-1));


 //// create a Object Myclass type String
        MyList<String> listStrings=new MyList<>();
        listStrings.add("Nguyen Thi Mong Mo");
        listStrings.add("Nguyen Ha Anh");
        listStrings.add("Ha Tuan Anh");
        listStrings.add("Ha Tuan Em");
        listStrings.add("Mai Hac De");
        listStrings.add("Ly Chieu Hoang");
        System.out.println("Element 1 is " + listStrings.get(0));
        System.out.println("Element 2 is " + listStrings.get(1));
        System.out.println("Element 3 is " + listStrings.get(2));
        System.out.println("Element 4 is " + listStrings.get(3));
        System.out.println("Element 5 is " + listStrings.get(4));
    }
}
