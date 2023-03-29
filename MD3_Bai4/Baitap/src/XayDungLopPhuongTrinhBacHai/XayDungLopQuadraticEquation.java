package XayDungLopPhuongTrinhBacHai;

import java.util.Scanner;

public class XayDungLopQuadraticEquation {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Giai Phuong Trinh Bac Hai ax^2+by+c=0 !");
        System.out.println("Nhap so a = ");
        double a= sc.nextDouble();
        System.out.println("Nhap so b = ");
        double b= sc.nextDouble();
        System.out.println("Nhap so c = ");
        double c= sc.nextDouble();
        GiaiBaiToan result=new GiaiBaiToan( a, b,c);
            System.out.println(result.display());
        if (a!=0){
            if (result.getDiscriminant()>0){
            System.out.println("Nghiem 1 : "+ result.getRoot1());
            System.out.println("Nghiem 2 : "+ result.getRoot2());
            } else if (result.getDiscriminant()==0) {
                System.out.println("Phuong trinh co nghiem la : "+ result.getRoot2());
            }else System.out.println("phuong trinh vo nghiem !");
        } else if (b==0) {
            if (c==0){
                System.out.println("Phuong trinh vo so nghiem !");
            }else System.out.println("phuong trinh vo nghiem !");
        }

    }
}
