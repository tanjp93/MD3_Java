package MoveAblePoint;

public class Main_movePoint {
    public static void main(String[] args) {
        Point point0=new Point();
        Point point1=new Point(20,10);
        System.out.println(point0);
        System.out.println(point1);
        MoveAblePoint moveP0=new MoveAblePoint();
        MoveAblePoint moveP1=new MoveAblePoint(20,10);
        MoveAblePoint moveP2=new MoveAblePoint(10,50,20,10);
        moveP0.move();
        moveP1.move();
        moveP2.move();
        System.out.println(moveP0);
        System.out.println(moveP1);
        System.out.println(moveP2);
    }
}
