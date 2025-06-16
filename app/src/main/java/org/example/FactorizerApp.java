package org.example;

/**
 * FactorizerApp demonstrates the use of the Factorizer class by
 * printing prime factor lists.
 */
public class FactorizerApp {

    /**
     * This is the entry point of the application. Runs sample factorizations
     * and prints them to the console.
     *
     * @param args command-line arguments (not used)
     */
    public static void main(String[] args) {
        // Instantiate a Factorizer for computing prime factors
        Factorizer factorizer = new Factorizer();

        // Example outputs
        System.out.println("primeFactors(0) -> " + factorizer.primeFactors(0));
        System.out.println("primeFactors(1) -> " + factorizer.primeFactors(1));
        System.out.println("primeFactors(9) -> " + factorizer.primeFactors(9));
        System.out.println("primeFactors(10) -> " + factorizer.primeFactors(10));
    }
}