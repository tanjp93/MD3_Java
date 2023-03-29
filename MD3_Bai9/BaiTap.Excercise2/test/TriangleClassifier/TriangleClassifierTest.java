package TriangleClassifier;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TriangleClassifierTest {
    public static final String isEquilateralTriangle = "This is a equilateral triangle ! (tam giác đều) ";
    public static final String isIsoscelesTriangle = "This is a isosceles triangle ! (tam giác cân)";
    public static final String isRegularTriangle = "This is a regular triangle ! (tam giác thường) ";
    public static final String isNotTriangle = "This is not a triangle ! ";

    @Test
    @DisplayName("Test classify triangle with side1= 2,side2=2,side3=2 ,This is a equilateral triangle !")
    void classifyTriangle222() {
        TriangleClassifier triangle=new TriangleClassifier(2,2,2);
        String result=triangle.classifyTriangle();
        String expected=isEquilateralTriangle;
        assertEquals(expected,result);
    }
    @Test
    @DisplayName("Test classify triangle with side1= 2,side2=2,side3=3 This is a isosceles triangle !" )
    void classifyTriangle223() {
        TriangleClassifier triangle=new TriangleClassifier(2,2,3);
        String result=triangle.classifyTriangle();
        String expected=isIsoscelesTriangle;
        assertEquals(expected,result);
    }
    @Test
    @DisplayName("Test classify triangle with side1= 3,side2=4,side3=5 This is a regular triangle !" )
    void classifyTriangle345() {
        TriangleClassifier triangle=new TriangleClassifier(3,4,5);
        String result=triangle.classifyTriangle();
        String expected=isRegularTriangle;
        assertEquals(expected,result);
    }
    @Test
    @DisplayName("Test classify triangle with side1= 8,side2=2,side3=3 This is not a triangle !" )
    void classifyTriangle823() {
        TriangleClassifier triangle=new TriangleClassifier(8,2,3);
        String result=triangle.classifyTriangle();
        String expected=isNotTriangle;
        assertEquals(expected,result);
    }
    @Test
    @DisplayName("Test classify triangle with side1= -1,side2=2,side3=1 This is not a triangle !" )
    void classifyTriangleMinus121() {
        TriangleClassifier triangle=new TriangleClassifier(-1,2,1);
        String result=triangle.classifyTriangle();
        String expected=isNotTriangle;
        assertEquals(expected,result);
    }
    @Test
    @DisplayName("Test classify triangle with side1= 0,side2=1,side3=1 This is not a triangle !" )
    void classifyTriangle011() {
        TriangleClassifier triangle=new TriangleClassifier(-1,2,1);
        String result=triangle.classifyTriangle();
        String expected=isNotTriangle;
        assertEquals(expected,result);
    }
}