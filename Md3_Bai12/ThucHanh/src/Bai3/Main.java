package Bai3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Student newstd1=new Student("Kien", 30, "HT");
        Student newstd2=new Student("Hung", 25, "HN");
        Student newstd3=new Student("Manh", 26, "TH");
        Student newstd4=new Student("Nam", 23, "DN");
        Student newstd5=new Student("Anh", 22, "HCM");
        List<Student> listStd=new ArrayList<>();
        listStd.add(newstd1);
        listStd.add(newstd2);
        listStd.add(newstd3);
        listStd.add(newstd4);
        listStd.add(newstd5);
        Collections.sort(listStd);
        System.out.println(listStd);
        AgeComparator ageComparator=new AgeComparator();
        Collections.sort(listStd,ageComparator);
        System.out.println(listStd);
    }
}
