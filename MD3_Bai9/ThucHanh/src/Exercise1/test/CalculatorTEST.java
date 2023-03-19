package Exercise1.test;

import Exercise1.Calculor;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTEST {
        int first=10;
        int second=5;
    @Test
    @DisplayName(" Testing Addition")
    public void testAdd(){
        int first=10;
        int second=5;
        int expected=15;
        int result= Calculor.add(first,second);
        assertEquals(expected,result);
    }
    @Test
    @DisplayName(" Testing Addition")
    public void testAdd2(){
        int first=2;
        int second=5;
        int expected=7;
        int result= Calculor.add(first,second);
        assertEquals(expected,result);
    }
    @Test
    @DisplayName(" Testing Addition")
    public void testAdd3(){
        int first=2;
        int second=5;
        int expected=7;
        int result= Calculor.add(first,second);
        assertEquals(expected,result);
    }
    @Test
    @DisplayName(" Testing Addition")
    public void testAdd4(){
        int first=2;
        int second=5;
        int expected=7;
        int result= Calculor.add(first,second);
        assertEquals(expected,result);
    }
    @Test
    @DisplayName(" Testing Addition")
    public void testAdd5(){
        int first=2;
        int second=5;
        int expected=7;
        int result= Calculor.add(first,second);
        assertEquals(expected,result);
    }
    @Test
    @DisplayName(" Testing Addition")
    public void testAdd6(){
        int first=2;
        int second=5;
        int expected=7;
        int result= Calculor.add(first,second);
        assertEquals(expected,result);
    }    @Test
    @DisplayName(" Testing Addition")
    public void testAdd7(){
        int first=2;
        int second=5;
        int expected=7;
        int result= Calculor.add(first,second);
        assertEquals(expected,result);
    }    @Test
    @DisplayName(" Testing Addition")
    public void testAdd1(){
        int first=2;
        int second=5;
        int expected=7;
        int result= Calculor.add(first,second);
        assertEquals(expected,result);
    }
    @Test
    @DisplayName(" Testing and subtraction !")
    public void testSub(){
        int first=10;
        int second=5;
        int result=Calculor.sub(first,second);
        int expected=5;
        assertEquals(expected,result);
    }
}
