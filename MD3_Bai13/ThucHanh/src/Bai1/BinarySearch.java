package Bai1;

public class BinarySearch {

    static int binarySearch(int[] list, int key) {
        int low=0;
        int hight = list.length-1;
        int mid;
        while (hight>=low){
            mid=(hight+low)/2;
            if (key==list[mid]){
                return mid;
            } else {
                if (key < list[mid]) {
                    hight = mid - 1;
                } else if (key > list[mid]) {
                    low = mid + 1;
                }
            }

        }
        return -1; /* Now high < low, key not found */
    }
}
