import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class MyFirstTest {
    @Test
    public void testAddition(){
        int num1 = 8;
        int num2 = 11;
        int expectedResult = 19;

        assertEquals(expectedResult, Calculator.add(num1, num2));
    }
    @Test
    public void testTipCalculator(){
        double cost = 22.56;
        double tipPerc = 15;
        double tip = 3.38;

        assertEquals(tip, Calculator.calculateTip(cost, tipPerc), .01);
    }

    @Test
    public void testStringMatch(){
        String str1 = "codeup";
        String str2 = "codeup";

        assertEquals(str1, str2);
    }

    @Test
    public void testArrayMatch(){
        List<String> languages = new ArrayList<>();
        List<String> moreLanguages = new ArrayList<>();

        assertNotEquals(languages, moreLanguages);
    }

    @Test
    public void testArrayMatch2(){
        int[] numbers = {1, 2, 3};
        int[] otherNumbers = new int[3];
        otherNumbers[0] = 1;
        otherNumbers[1] = 2;
        otherNumbers[2] = 3;

        assertArrayEquals(numbers, otherNumbers);
    }

    @Test
    public void testContains(){
        String language = "PHP";

        assertTrue(language.contains("H"));
        assertFalse(language.contains("J"));
    }

    @Test
    public void testNull(){
        String language = null;
        assertNull(language);

        language = "Java";
        assertNotNull(language);
    }
}
