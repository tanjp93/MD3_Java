package Bai2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] arr = createRandom();
        System.out.println();
        System.out.println("Nhap vi tri can tim kiem : ");
        Scanner scanner = new Scanner(System.in);
        int indexFind = Integer.parseInt(scanner.nextLine());
        findElement(arr,indexFind);
    }

    static int[] createRandom() {
        int size=100;
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = (int) (Math.random() * size);
            System.out.print(arr[i] + " ");
        }
        return arr;
    }

    static void findElement(int[] arr,int indexFind) {
        try {
            System.out.println("Gia tri can tim la : "+arr[indexFind]);
        }catch (IndexOutOfBoundsException e){
            System.err.println("chi so ngoai le");
        }
    }
}
