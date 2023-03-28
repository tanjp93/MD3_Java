package Bai3;

import java.util.Comparator;

public class AgeComparator implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {
        int result = -2;
        if (o1.getAge() > o2.getAge()) {
            result= 1;
        } else if (o1.getAge() < o2.getAge()) {
            result=  -1;
        } else if (o1.getAge().equals(o2.getAge())) {
            result=  0;
        }
        return result;
    }
}
