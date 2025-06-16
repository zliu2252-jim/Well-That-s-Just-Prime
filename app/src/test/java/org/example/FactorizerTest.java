package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.ArrayList;

/**
 * Unit tests for Factorizer, verifying prime factorization behavior
 * under various input scenarios.
 */
class FactorizerTest {

    Factorizer factorizer = new Factorizer();

    /**
     * Edge case: 0 has no prime factors, expect an empty list.
     */
    @Test
    void itReturnsAnEmptyListForZero() {
        assertEquals(new ArrayList<>(), factorizer.primeFactors(0), "0 should yield an empty list");
    }

    /**
     * Edge case: 1 and negative numbers have no prime factors.
     */
    @Test
    void itReturnsAnEmptyListForOneAndNegative() {
        assertEquals(new ArrayList<>(), factorizer.primeFactors(1), "1 should yield an empty list");
        assertEquals(new ArrayList<>(), factorizer.primeFactors(-5), "Negative numbers should " +
                "yield an empty list");
    }

    /**
     * Prime numbers should return a list containing only themselves.
     */
    @Test
    void itReturnsSelfForPrimeNumbers() {
        ArrayList<Integer> expected = new ArrayList<>();
        expected.add(17);
        assertEquals(expected, factorizer.primeFactors(17), "A prime number should return itself");
    }

    /**
     * Composite numbers return correct prime factor lists,
     * including repeated factors in ascending order.
     */
    @Test
    void itReturnsCorrectFactorsForCompositeNumbers() {
        ArrayList<Integer> expected9 = new ArrayList<>();
        expected9.add(3);
        expected9.add(3);
        assertEquals(expected9, factorizer.primeFactors(9), "9 should factor to [3, 3]");

        ArrayList<Integer> expected10 = new ArrayList<>();
        expected10.add(2);
        expected10.add(5);
        assertEquals(expected10, factorizer.primeFactors(10), "10 should factor to [2, 5]");

        ArrayList<Integer> expected100 = new ArrayList<>();
        expected100.add(2);
        expected100.add(2);
        expected100.add(5);
        expected100.add(5);
        assertEquals(expected100, factorizer.primeFactors(100), "100 should factor to [2, 2, 5, 5]");
    }
}
