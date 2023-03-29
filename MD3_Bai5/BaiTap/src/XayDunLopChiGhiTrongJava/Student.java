package XayDunLopChiGhiTrongJava;

public class Student {
    public static void main(String[] args) {
        AccessModifier student= new AccessModifier();
        System.out.println("Name student :\t"+student.getName()+"\nClass :\t"+student.getClasses());
        AccessModifier student1= new AccessModifier("David","CO3");
        System.out.println("Name student 1 :\t"+student1.getName()+"\nClass :\t"+student1.getClasses());
    }
}
