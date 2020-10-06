package com.spirittesting.academy.challenges.primes;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class PrimeGeneratorTest {

    PrimeGenerator primeGenerator;

    @BeforeEach
    void setup() {
        primeGenerator = new PrimeGenerator();
    }

    @Test
    void sixth_prime_is_13() {
        assertEquals(13L, primeGenerator.getPrime(6));
    }

    @Test
    void first_10_primes_match() {
        assertIterableEquals(Arrays.asList(2L, 3L, 5L, 7L, 11L, 13L, 17L, 19L, 23L, 29L), primeGenerator.getFirstNPrimes(10));
    }

    @Test
    void index_1400_is_11657() {
        assertEquals(11657L, primeGenerator.getPrime(1400));
    }

    @Test void letztePrimzahlMitSieb() {
        assertEquals(9973L, primeGenerator.getPrime(1229));
    }

    @Test void erstePrimzahlNachSieb() {
        assertEquals(10007, primeGenerator.getPrime(1230));
    }


}
