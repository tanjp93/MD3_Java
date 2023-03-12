package StaticMethod;

import java.util.Scanner;

public class Main_StaticMethod {
    public static void main(String[] args) {
        Student.change();
        Student student1=new Student(1,"tuan");
        Student student2=new Student(2,"hung");
        Student student3=new Student(3,"toan");
        student1.display();
        student2.display();
        student3.display();
    }
}
