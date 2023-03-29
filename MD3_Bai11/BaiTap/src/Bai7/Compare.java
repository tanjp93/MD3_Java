package Bai7;

import java.util.Comparator;

public class Compare implements Comparator<Employees> {
    int compare;
    @Override
    public int compare(Employees element1,Employees element2){
         compare=element1.getBirday().compareTo(element2.getBirday());
        return compare;
    }
}
