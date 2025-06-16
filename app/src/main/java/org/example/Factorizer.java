package org.example;

import java.util.ArrayList;

/**
 * Factorizer provides a method to compute the prime factorization
 * of an integer and return the prime factors.
 */
public class Factorizer {

    /**
     * Returns a list of the prime factors of n (excluding 1).
     * If n is null or <= 1, returns an empty list.
     *
     * @param n the integer to factorize
     * @return an ArrayList of prime factors
     */
    public ArrayList<Integer> primeFactors(Integer n) {
        ArrayList<Integer> factors = new ArrayList<>();
        if (n == null || n <= 1) {
            return factors;
        }

        int value = n;

        // Extract factors of 2 when the value is even
        while (value % 2 == 0) {
            factors.add(2);
            value /= 2;
        }

        // Factor out odd primes
        for (int p = 3; p * p <= value; p += 2) {
            while (value % p == 0) {
                factors.add(p);
                value /= p;
            }
        }

        // If there's any remainder >1, it's a prime factor
        if (value > 1) {
            factors.add(value);
        }

        return factors;
    }
}
