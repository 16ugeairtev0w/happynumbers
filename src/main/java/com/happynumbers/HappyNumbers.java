package com.happynumbers;

import java.util.stream.IntStream;

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

        // Using the fact that the cycle for a non-looping number must terminate
        // within a (strictly less than) 1000 steps. In other words, if we have
        // not converged witin 1000 steps it's not a Happy number.
        for (int i = 0; i < 1000; i++) {
            if (number == 1) {
                return true;
            }

            number = sumSquaredDigits(number);
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

    /**
     * Returns a stream of all happy numbers in the interval (1, 1000).
     */
    public IntStream stream() {
        return IntStream.range(1,1001).filter(this::isHappy);
    }
}
