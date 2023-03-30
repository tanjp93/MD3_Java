package Bai1;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr={1,3,5,7,0,-2,-6,-4,9,5,-1};

        System.out.println(Arrays.toString(arr));
        sortByInsert(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void sortByInsert(int[] arr) {
        for (int i = 0; i <arr.length ; i++) {
            int temp=arr[i];
            int j=i-1;
            while (j>=0&&arr[j]>temp){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=temp;
        }
    }
}