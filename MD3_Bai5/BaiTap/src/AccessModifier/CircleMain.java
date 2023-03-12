package AccessModifier;

public class CircleMain {
    public static void main(String[] args) {
        CircleAcc circle=new CircleAcc();
        System.out.println("Initial state :\t"+circle.getRadius()+"\t"+circle.getColor());
        CircleAcc circle1=new CircleAcc(5.0,"blue");
        System.out.println("Initial state :\t"+circle1.getRadius()+"\t"+circle1.getColor());
        CircleAcc circle2=new CircleAcc(3.0,"yellow");
        System.out.println("Initial state :\t"+circle2.getRadius()+"\t"+circle2.getColor());
    }
}
