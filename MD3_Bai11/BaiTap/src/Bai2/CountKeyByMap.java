package Bai2;

import java.util.Arrays;
import java.util.Map;
import java.util.Stack;
import java.util.TreeMap;

public class CountKeyByMap {
    public static void main(String[] args) {
        String textString = "Moi tu lay ra 1 ky tu";
        textString = textString.toLowerCase();
        String[] textStrArr = textString.split(" ");
        System.out.println(Arrays.toString(textStrArr));
        Map<String, Integer> woldCountArr = new TreeMap<>();
        int count=1;
        for (int i = 0; i < textStrArr.length; i++) {
            if (!woldCountArr.containsKey(textStrArr[i])) {
                woldCountArr.put(textStrArr[i], 1);
            } else {
                woldCountArr.replace(textStrArr[i], woldCountArr.get(textStrArr[i]) + 1);
//                woldCountArr.put(textStrArr[i],count + 1);
//                count ++;
            }
        }
        System.out.println(woldCountArr);
    }
}
