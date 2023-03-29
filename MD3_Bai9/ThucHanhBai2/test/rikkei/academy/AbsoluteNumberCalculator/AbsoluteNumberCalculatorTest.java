package rikkei.academy.AbsoluteNumberCalculator;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class AbsoluteNumberCalculatorTest {
    @Test
    @DisplayName("find Absolute Number by 0")
    void testFindAbsolute0() {
        int number = 0 ;
        int expected = 0;
        int result = AbsoluteNumberCalculator.findAbsolute(number);
        assertEquals(expected, result);
    }

    @Test
    @DisplayName("find Absolute Number by -1")
    void testFindAbsolute1() {
        int number = 0;
        int expected = 0;
        int result = AbsoluteNumberCalculator.findAbsolute(number);
        assertEquals(expected, result);
    }

    @Test
    @DisplayName("find Absolute Number by -2")
    void testFindAbsolute2() {
        int number = -2;
        int expected = 0;
        int result = AbsoluteNumberCalculator.findAbsolute(number);
        assertEquals(expected, result);
    }
}