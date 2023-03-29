package rikkei.academy.test;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import rikkei.academy.test.rikkei.academy.Calculator;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {
    @Test
    @DisplayName("Testing Addition !")
    void testCalculateAdd(){
        int a=1;
        int b=1;
        char o='+';
        int expected=2;
        int result = Calculator.calculate(a,b,o);
        assertEquals(expected,result);
    }
    @Test
    @DisplayName("Testing Subtraction !")
    void testCalculateSub(){
        int a=5;
        int b=3;
        char o='-';
        int expected=4;
        int result = Calculator.calculate(a,b,o);
        assertEquals(expected,result);
    }
    @Test
    @DisplayName("Testing multiplication !")
    void testCalculateMu(){
        int a=2;
        int b=2;
        char o='*';
        int expected=4;
        int result = Calculator.calculate(a,b,o);
        assertEquals(expected,result);
    }
    @Test
    @DisplayName("Testing division !")
    void testCalculateDiv(){
        int a=8;
        int b=2;
        char o='/';
        int expected=3;
        int result = Calculator.calculate(a,b,o);
        assertEquals(expected,result);
    }
}

