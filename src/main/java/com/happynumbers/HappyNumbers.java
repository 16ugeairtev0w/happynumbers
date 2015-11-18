package com.happynumbers;

/**
 * Tool for working with Happy numbers.
 *
 * A Happy number is a number for which the proccess of repeatedly summing the
 * squares of the digits in the number results in the number 1. For example,
 * starting with the number 19:
 *
 * 19  -> 1² + 9² = 82
 * 82  -> 8² + 2² = 68
 * 68  -> 6² + 8² = 100
 * 100 -> 1² + 0² + 0² = 1
 *
 * For more details, @see <a href="https://en.wikipedia.org/wiki/Happy_number">the Wikipedia entry</a>
 */
public class HappyNumbers {
    /**
     * Check whether @{code number} is a happy number.
     *
     * Only input values up to 1000 is supported.
     * @param number The number to check whether it's happy or not. Values
     *               larger thaan 1000 will result in an
     *               IllegalArgumentException being thrown.
     */
    public boolean isHappy(int number) {
        if (number > 1000) {
            throw new IllegalArgumentException("number larger than 1000 not supported");
        }

        return false;
    }

    // Return the sum of the squares of the digits in number
    int sumSquaredDigits(int number) {
        int sum = 0;
        while (number > 0) {
            int lastDigit = number % 10;
            sum += lastDigit * lastDigit;

            number /= 10;
        }

        return sum;
    }
}
