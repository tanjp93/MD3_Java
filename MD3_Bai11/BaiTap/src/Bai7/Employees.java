package Bai7;

import java.util.Date;

public class Employees {
        private String name;
        private int age;
        private boolean isGender;
        private Date birday;

        public Employees(String name, int age, boolean isGender, Date birday) {
                this.name = name;
                this.age = age;
                this.isGender = isGender;
                this.birday = birday;
        }

        public Employees() {
        }

        public String getName() {
                return name;
        }

        public void setName(String name) {
                this.name = name;
        }

        public int getAge() {
                return age;
        }

        public void setAge(int age) {
                this.age = age;
        }

        public boolean isGender() {
                return isGender;
        }

        public void setGender(boolean gender) {
                isGender = gender;
        }

        public Date getBirday() {
                return birday;
        }

        public void setBirday(Date birday) {
                this.birday = birday;
        }

        public int compare(Employees element1,Employees element2){
                int compare=element1.getBirday().compareTo(element2.getBirday());

                return compare;
        }

        @Override
        public String toString() {
                return "Employees{" +
                        "name='" + name + '\'' +
                        ", age=" + age +
                        ", isGender=" + isGender +
                        ", birday=" + birday +
                        '}';
        }
}
