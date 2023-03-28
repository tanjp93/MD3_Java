import Bai2.Student;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Student newStd1=new Student("Nguyen Van A",25,"HN");
        Student newStd2=new Student("Nguyen Van B",22,"HCM");
        Student newStd3=new Student("Nguyen Van C",23,"DN");
        Student newStd4=new Student("Nguyen Van D",21,"TH");
        Map<Integer,Student>hashMap=new HashMap<>();
        hashMap.put(1,newStd1);
        hashMap.put(2,newStd2);
        hashMap.put(3,newStd3);
        hashMap.put(4,newStd4);
        System.out.println("-----------------------------------------");
        for (Map.Entry <Integer,Student> std: hashMap.entrySet()) {
            System.out.println("std hashMap>>>>>>>>>>"+std);
        }
        System.out.println("--------------------------------------------------------");
        Set<Student>students=new HashSet<>();
        students.add(newStd1);
        students.add(newStd2);
        students.add(newStd3);
        students.add(newStd4);
        for (Student std:students) {
            System.out.println("std hashSet>>>>>>>>"+std);
        }
        System.out.println("--------------------------------------------------------");
    }
}