package StaticMethod;

public class Student {
    private int rollNo;
    private String name;
    private static  String college="ABC";
    Student (int a,String b){
        name=b;
        rollNo=a;
    }
    static void change(){
        college="Rikkei";
    }
    void display(){
        System.out.println("rollNo\t :"+rollNo+"\tname: "+name+"\tcollege: "+college);
    }
}
