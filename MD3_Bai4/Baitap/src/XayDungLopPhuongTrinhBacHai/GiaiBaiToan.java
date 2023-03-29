package XayDungLopPhuongTrinhBacHai;

public class GiaiBaiToan {
    double a, b, c;

    public GiaiBaiToan(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public Double getA(){
        return this.a;
    }
    public Double getB(){
        return this.b;
    }
    public Double getC(){
        return this.c;
    }
    public String display(){
       return "Phuong trinh cua ban :" +this.a+"*X^2"+this.b+"*X"+this.c +"=0";
    }

    public Double getDiscriminant(){
        return Math.pow(this.b,2) - 4*this.a*this.c;
    }

    public Double getRoot1()  {
        return (-this.b+Math.sqrt(getDiscriminant()))/(2*this.a);
    }
    public Double getRoot2()  {
        return (-this.b-Math.sqrt(getDiscriminant()))/(2*this.a);
    }
}
