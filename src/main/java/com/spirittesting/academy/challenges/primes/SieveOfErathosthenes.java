package com.spirittesting.academy.challenges.primes;

import java.util.*;

/**
 * Das Sieb des Erathosthenes erzeugt schnell alle Primzahlen bis zu einem Schwellenwert im Integer-Zahlenraum. * 
 */
public class SieveOfErathosthenes {

    private final List<Integer> primes = new ArrayList<>();

    /** Berechnet alle Primzahlen kleiner als <code>maximum</code> */
    public SieveOfErathosthenes(int maximum) {
        computePrimes(maximum);
    }

    /**
     * Primzahlen sind alle Zahlen größer als 1, die keine weiteren Teiler besitzen.
     * Das Sieb des Erathosthenes erzeugt Primzahlen wie folgt:
     * <ul>
     *  <li>Schreibe alle Zahlen von 2 bis maximum auf</li>
     *  <li>Finde die nächste Zahl</li>
     *  <li>Streiche alle Vielfachen der Zahl von der Liste</li>
     * </ul>
     * 
     * Die Zahlen, die übrig sind, wurden nicht gestrichen. Sie besitzen also keine Teiler außer 1 und sich selbst.
     * 
     * <p>Technische Einschränkung: Diese Implementierung arbeitet mit einem Array. Java verwaltet Array-Indizes als
     * <code>int</code>, der Array kann also nicht länger sein als <code>Integer.MAX_VALUE</code>. Da jede Zelle im
     * Array einer natürlichen Zahl entspricht, kann also keine Primzahl größer als <code>Integer.MAX_VALUE</code>
     * berechnet werden.
     */
    private void computePrimes(int maximum) {
        boolean[] sieve = new boolean[maximum];
        Arrays.fill(sieve, true);
        sieve[0] = false;
        sieve[1] = false;
        for (int i = 2; i < maximum; i++) {
            if (sieve[i]) {
                primes.add(i);
                for (int j = 2 * i; j < maximum; j += i) {
                    sieve[j] = false;
                }
            }
        }        
    }

    /** Holt die berechneten Primzahlen in aufsteigender Reihenfolge ab. */
	public List<Integer> getPrimes() {
		return this.primes;
	}


    
}
