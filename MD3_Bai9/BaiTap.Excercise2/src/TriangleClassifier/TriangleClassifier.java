package TriangleClassifier;

public class TriangleClassifier {
    public static final String isEquilateralTriangle = "This is a equilateral triangle ! (tam giác đều) ";
    public static final String isIsoscelesTriangle = "This is a isosceles triangle ! (tam giác cân)";
    public static final String isRegularTriangle = "This is a regular triangle ! (tam giác thường) ";
    public static final String isNotTriangle = "This is not a triangle ! ";
    int side1;
    int side2;
    int side3;

    public TriangleClassifier() {
    }

    public TriangleClassifier(int side1, int side2, int side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public void setSide1(int side1) {
        this.side1 = side1;
    }

    public void setSide2(int side2) {
        this.side2 = side2;
    }

    public void setSide3(int side3) {
        this.side3 = side3;
    }

    public String classifyTriangle() {
        boolean isTriangle = false;
        if (side1 > 0 && side2 > 0 && side3 > 0) {
            isTriangle = true;
        } else isTriangle = false;
        if (side1 + side2 > side3 & side1 + side3 > side1 && side2 + side3 > side1) {
            isTriangle = true;
        } else isTriangle = false;

        if (isTriangle) {
            if (side1 == side2 || side1 == side3 || side2 == side3) {
                if (side1 == side2 && side1 == side3) {
                    return isEquilateralTriangle;
                } else return isIsoscelesTriangle;
            } else return isRegularTriangle;
        } else return isNotTriangle;
    }
}
