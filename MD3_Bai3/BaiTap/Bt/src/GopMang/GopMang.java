package GopMang;

import java.util.Arrays;

public class GopMang {
    public static void main(String[] args) {
        String[] arr1={"Ngan","Thang","Cha"};
        String[] arr2={"Ngan","Thang","Cha"};
        String[] arr3=addTwoArr(arr1,arr2);
        System.out.println("Mang thu duoc la : " + Arrays.toString(arr3));
    }

    public static String[] addTwoArr(String[] arr1,String[] arr2) {
        String[] arr3=new String[arr1.length+ arr2.length];
        for (int i = 0; i < arr1.length; i++) {
            arr3[i]=arr1[i];
        }
        for (int j = 0; j < arr2.length ; j++) {
            arr3[arr1.length+j]=arr2[j];
        }return arr3;
    }
}

