package com.happynumbers;

import static junit.framework.Assert.*;

import org.junit.*;

public class HappyNumbersTest {
    private HappyNumbers happyNumbers = new HappyNumbers();

    @Test
    public void nextHappyNumberStep() {
        assertEquals(4, happyNumbers.sumSquaredDigits(2));
    }
}
