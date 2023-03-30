import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int side1;
        int side2;
        int side3;
            System.out.println("Input distance of side 1 :");
            side1 = Integer.parseInt(scanner.nextLine());
            System.out.println("Input distance of side 2 :");
            side2 = Integer.parseInt(scanner.nextLine());
            System.out.println("Input distance of side 3 :");
            side3 = Integer.parseInt(scanner.nextLine());

                try{
                    if (side1<0||side2<0||side3<0){
                        throw new IlligalTriangleException();
                }else {
                        if (side1+side2<side3||side1+side3<side2||side2+side3<side1){
                            throw new IlligalTriangleException();
                        }
                    }
            } catch (IlligalTriangleException e) {
                    System.err.println("try again !");
                }
    }
}