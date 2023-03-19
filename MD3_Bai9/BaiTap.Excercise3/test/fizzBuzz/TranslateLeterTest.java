package fizzBuzz;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TranslateLeterTest {
    @Test
    @DisplayName("Test with number 0")
    void toTranslate0(){
        TranslateLeter toLeter = new TranslateLeter();
        String result =toLeter.totranslate(0);
        String expected="zero";
        assertEquals(expected,result);
    }
    @Test
    @DisplayName("Test with number 50")
    void toTranslate50(){
        TranslateLeter toLeter = new TranslateLeter();
        String result =toLeter.totranslate(50);
        String expected="fifty";
        assertEquals(expected,result);
    }
    @Test
    @DisplayName("Test with number 35")
    void toTranslate35(){
        TranslateLeter toLeter = new TranslateLeter();
        String result =toLeter.totranslate(35);
        String expected="thirtyfive";
        assertEquals(expected,result);
    }
    @Test
    @DisplayName("Test with number 60")
    void toTranslate60(){
        TranslateLeter toLeter = new TranslateLeter();
        String result =toLeter.totranslate(60);
        String expected="sixty";
        assertEquals(expected,result);
    }
}