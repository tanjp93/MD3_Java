package Bai3;

import java.util.Arrays;

public class selectionSort {
    public static void main(String[] args) {
        double[] list = {1, 9, 4.5, 6.6, 5.7, -4.5,5.0,0.5,0.1,2.0,2.2,6.6,3.5};
        System.out.println(Arrays.toString(list));
        sortBySelection(list);
        System.out.println(Arrays.toString(list));
    }
    public static void sortBySelection(double[] list){
        for (int i = 0; i <list.length-1 ; i++) {
            for (int j = i+1; j <list.length ; j++) {
                double temp;
                if (list[i]>list[j]){
                    temp=list[j];
                    list[j]=list[i];
                    list[i]=temp;
                }
            }
        }
    }
}
