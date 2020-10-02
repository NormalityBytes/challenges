package com.spirittesting.academy.challenges.primes;

import static org.junit.jupiter.api.Assertions.assertIterableEquals;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

public class SieveOfErathosthenesTest {

    @Test
    void primes_to_20() {
        SieveOfErathosthenes sieve = new SieveOfErathosthenes(20);
        assertIterableEquals(Arrays.asList(2,3,5,7,11,13,17,19), sieve.getPrimes());
    }
    
}
