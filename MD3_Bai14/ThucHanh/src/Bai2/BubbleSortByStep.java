package Bai2;

import java.util.Arrays;

public class BubbleSortByStep {
    public static void main(String[] args) {
        int[]listInteger={5,6,-2,4,1,9,2,8,3};
        System.out.println(Arrays.toString(listInteger));
        bubbleSortByStep(listInteger);
        System.out.println(Arrays.toString(listInteger));
    }
    static void bubbleSortByStep(int[] list){
        boolean needNextPass = true;
        for (int k = 1; k < list.length && needNextPass; k++) {
            needNextPass = false;
            for (int i = 0; i < list.length - k; i++) {
                if (list[i] > list[i + 1]) {
                    /* Swap list[i] with list[i + 1] */
                    System.out.println("Swap " + list[i] + " with " + list[i + 1]);
                    int temp = list[i];
                    list[i] = list[i + 1];
                    list[i + 1] = temp;
                    needNextPass = true; /* Next pass still needed */
                }
            }
            /* Array may be sorted and next pass not needed */
            if (needNextPass == false) {
                System.out.println("Array may be sorted and next pass not needed");
                break;
            }
            /* Show the list after sort */
            System.out.print("List after the  " + k + "' sort: ");
            for (int j = 0; j < list.length; j++) {
                System.out.print(list[j] + "\t");
            }
            System.out.println();
        }

    }
}
