package HeCacDoiTuongHinhHoc;

public class Test1 {
    public static void main(String args[]){
    Student s1=new Student(101,"Raj","lucknow");
    Student s2=new Student(102,"Vijay","ghaziabad");

    System.out.println(s1);//compiler writes here s1.toString()
    System.out.println(s2);//compiler writes here s2.toString()
}
    static class Student{
        int rollno;
        String name;
        String city;

         Student(int no, String nameStd, String cityStd){
            rollno=no;
            name=nameStd;
            city=cityStd;
        }
//        public String toString(){//overriding the toString() method
//            return rollno+" "+name+" "+city;
//        }

        @Override
        public String toString() {
            return "Student{" +
                    "rollno=" + rollno +
                    ", name='" + name + '\'' +
                    ", city='" + city + '\'' +
                    '}';
        }
    }
}
