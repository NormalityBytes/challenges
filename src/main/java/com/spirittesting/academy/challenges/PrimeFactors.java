package com.spirittesting.academy.challenges;

import java.util.ArrayList;
import java.util.List;

import com.spirittesting.academy.challenges.primes.SieveOfErathosthenes;

public class PrimeFactors implements Challenge {

    /** Enthält Primzahlen in aufsteigender Reihenfolge */
    private List<Integer> primes;

    @Override
    public String compute(String... options) {
        Long number = Long.parseLong(options[0]);
        return primeFactors(number).stream()
            .max(Long::compare)
            .get()
            .toString();
    }

    /** Berechnet rekursiv die Primfaktoren von <code>number</code>. Das Ergebnis ist aufsteigend sortiert. */
	public List<Integer> primeFactors(long number) {
        if (primes == null) {
            primes = new SieveOfErathosthenes(sqrt(number)).getPrimes();
        }       

		return primeFactors(number, new ArrayList<>());
    }
    
    /** Bestimmt den kleinsten Primfaktor von <code>number</code>, fügt ihn der Liste gefundener Faktoren hinzu und rekursiert. */
    private List<Integer> primeFactors(long number, List<Integer> factorsFound) {
        if (number == 1L) return factorsFound;
        for (Integer prime : primes) {
            if (number % prime == 0) {
                factorsFound.add(prime);
                return primeFactors(number / prime, factorsFound);
            }
        }
        factorsFound.add((int) number);
        return factorsFound;
    }

    /** Berechnet den ganzzahligen Anteil der Wurzel von <code>i</code>. Beispiel: sqrt(200) ist 14. */
	public int sqrt(long i) {
		return (int) Math.floor(Math.sqrt(i));
	}
    
}
