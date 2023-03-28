package Bai7;

import java.util.*;

public class CompareStd {
    public static void main(String[] args) {
        List<Employees> listEmployees = new ArrayList<>();
        listEmployees.add(new Employees("Nguyen Van A", 25, true, new Date(2022, 01, 20)));
        listEmployees.add(new Employees("Nguyen Van B", 23, true, new Date(2021, 02, 20)));
        listEmployees.add(new Employees("Nguyen Thi C", 21, false, new Date(2020, 03, 15)));
        listEmployees.add(new Employees("Ha Thi D", 21, false, new Date(2022, 11, 15)));
        Compare compare = new Compare();
        System.out.println("Before sort : "+listEmployees);
        Collections.sort(listEmployees, compare);

        Queue<Employees> queueNam = new LinkedList<>();
        Queue<Employees> queueNu = new LinkedList<>();
        for (Employees employee:listEmployees ) {
            if (!employee.isGender()){
                queueNu.add(employee);
            }else queueNam.add(employee);
        }
        System.out.println(queueNu);
        System.out.println(queueNam);
        List<Employees>displayAfterSort=new ArrayList<>();

        while(queueNu.isEmpty()){
            Employees temp=queueNu.poll();
            displayAfterSort.add(temp);
        }
        while(queueNam.isEmpty()){
            Employees temp=queueNam.poll();
            displayAfterSort.add(temp);
        }
        System.out.println("After sort : "+displayAfterSort);
    }
}
