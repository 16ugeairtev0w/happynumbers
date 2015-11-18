package com.happynumbers;

import static junit.framework.Assert.*;

import org.junit.*;

public class HappyNumbersTest {
    private HappyNumbers happyNumbers = new HappyNumbers();

    @Test
    public void allSingleDigitSquared() {
        for (int d = 0; d < 10; d++) {
            assertEquals(d*d, happyNumbers.sumSquaredDigits(d));
        }
    }

    @Test
    public void longNumberSquared() {
        int aLongNumber = 1940287356;
        assertEquals(285, happyNumbers.sumSquaredDigits(aLongNumber));
    }
}
