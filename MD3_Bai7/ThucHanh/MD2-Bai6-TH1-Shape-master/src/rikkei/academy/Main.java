package rikkei.academy;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	    // Kiểm thử class Shape
        ComparableCircle[] circles =new ComparableCircle[]{new ComparableCircle(3.6),new ComparableCircle(),new ComparableCircle(3.5,"indigo",false)};
        System.out.println("Pre-sorted : ");
        for (ComparableCircle comparableCircle :circles){
            System.out.println(comparableCircle);
        }
        Arrays.sort(circles);
        System.out.println("After-sorted : ");;
        for (ComparableCircle comparableCircle :circles){
            System.out.println(comparableCircle);
        }
    }
}
