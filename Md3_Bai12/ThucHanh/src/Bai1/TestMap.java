package Bai1;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class TestMap {
    public static void main(String[] args) {
        Map<String,Integer>hashMap=new HashMap<>();
        hashMap.put("Nguyen Van C",25);
        hashMap.put("Nguyen Van B",23);
        hashMap.put("Nguyen Van A",19);
        System.out.println("hashMap"+hashMap);
        Map<Integer,String> hashMap1=new HashMap<>();
        hashMap1.put(3,"Ha Tuan Anh");
        hashMap1.put(2,"Ha Tuan Em");
        hashMap1.put(1,"Ha Tuan Kha");
        System.out.println(hashMap1);
        System.out.println("The age for "+" Nguyen Van A : "+ hashMap1.get("Nguyen Van C"));
        Map<String,Integer>linkedHashMap=new LinkedHashMap<>();
        linkedHashMap.put("Nguyen Van C",25);
        linkedHashMap.put("Nguyen Van A",19);
        linkedHashMap.put("Nguyen Van B",24);
        System.out.println("linkedHashMap>>>>>>>>>"+linkedHashMap);
        System.out.println("The age for "+" Nguyen Van A : "+ linkedHashMap.get("Nguyen Van C"));

        Map<String,Integer>treeMap=new TreeMap<>();
        treeMap.put("Nguyen Van C",25);
        treeMap.put("Nguyen Van A",19);
        treeMap.put("Nguyen Van B",24);
        System.out.println("treeMap>>>>>>>>>>>"+treeMap);
        System.out.println("The age for "+" Nguyen Van A : "+ treeMap.get("Nguyen Van C"));
    }
}
