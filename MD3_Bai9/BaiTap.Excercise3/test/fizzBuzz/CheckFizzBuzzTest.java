package fizzBuzz;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CheckFizzBuzzTest {
    @Test
    @DisplayName("Test 10")
    public void testFizzBuzz10(){
        String result= CheckFizzBuzz.isFizzBuzz(10);
        String expected="Buzz";
        assertEquals(expected,result);
    }
    @Test
    @DisplayName("Test 10")
    public void testFizzBuzz6(){
        String result= CheckFizzBuzz.isFizzBuzz(6);
        String expected="Fizz";
        assertEquals(expected,result);
    }
    @Test
    @DisplayName("Test 15")
    public void testFizzBuzz15(){
        String result= CheckFizzBuzz.isFizzBuzz(15);
        String expected="Fizz Buzz";
        assertEquals(expected,result);
    }
    @Test
    @DisplayName("Test -5")
    public void testFizzBuzzMinus5(){
        String result= CheckFizzBuzz.isFizzBuzz(-5);
        String expected="Your input number is not positive integer ";
        assertEquals(expected,result);
    }

}