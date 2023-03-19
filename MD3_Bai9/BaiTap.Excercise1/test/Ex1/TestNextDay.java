package Ex1;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TestNextDay {
    @Test
    @DisplayName("test day 1/1/2018")
    void nextDay01012018() {
        int day = 1;
        int month = 1;
        int year = 2018;
        NextDayCalculator nextday=new NextDayCalculator(day,month,year);
        String result = nextday.findNextdate();
        String expected = "2/1/2018";
        assertEquals(expected, result);
    }
    @Test
    @DisplayName("test day 31/1/2018")
    void nextDay3112018() {
        int day = 31;
        int month = 1;
        int year = 2018;
        NextDayCalculator nextday=new NextDayCalculator(day,month,year);
        String result = nextday.findNextdate();
        String expected = "1/2/2018";
        assertEquals(expected, result);
    }
    @Test
    @DisplayName("test day 30/4/2018")
    void nextDay3042018() {
        int day = 30;
        int month = 4;
        int year = 2018;
        NextDayCalculator nextday=new NextDayCalculator(day,month,year);
        String result = nextday.findNextdate();
        String expected = "1/5/2018";
        assertEquals(expected, result);
    }
    @Test
    @DisplayName("test day 30/4/2018")
    void nextDay2822018() {
        int day = 28;
        int month = 2;
        int year = 2018;
        NextDayCalculator nextday=new NextDayCalculator(day,month,year);
        String result = nextday.findNextdate();
        String expected = "1/3/2018";
        assertEquals(expected, result);
    }
    @Test
    @DisplayName("test day 28/2/2020")
    void nextDay2822020() {
        int day = 29;
        int month = 2;
        int year = 2018;
        NextDayCalculator nextday=new NextDayCalculator(day,month,year);
        String result = nextday.findNextdate();
        String expected = "1/3/2018";
        assertEquals(expected, result);
    }
    @Test
    @DisplayName("test day 31/12/2020")
    void nextDay31122018() {
        int day = 31;
        int month = 12;
        int year = 2018;
        NextDayCalculator nextday=new NextDayCalculator(day,month,year);
        String result = nextday.findNextdate();
        String expected = "1/1/2019";
        assertEquals(expected, result);
    }

}