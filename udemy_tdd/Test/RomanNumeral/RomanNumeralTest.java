package RomanNumeral;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class RomanNumeralTest {

    RomanNumeral romanNumeral;

    @Before
    public void setUp() {
        romanNumeral = new RomanNumeral();
    }

    @Test
    public void aSingleRoman() {
        int one = romanNumeral.convert("I");
        int five = romanNumeral.convert("V");

        assertEquals(1, one);
        assertEquals(5, five);
    }

    @Test
    public void aDoubleRoman() {
        int nineHundred = romanNumeral.convert("CM");
        assertEquals(900, nineHundred);

    }
}