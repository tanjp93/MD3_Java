package Bai2;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr={1,-2,5,7,0,-2,-6,-4,-10,5,-1,-8,-20};

        System.out.println(Arrays.toString(arr));
        insertionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void insertionSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int temp=arr[i];
            int j=i-1;
            while(j>=0&&temp<arr[j]){
                arr[j+1]=arr[j];
                j--;
            };
            arr[j+1]=temp;
        }
    }
}
