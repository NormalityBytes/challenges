package com.spirittesting.academy.challenges;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertIterableEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

public class PrimeFactorsTest {
    
    PrimeFactors primeFactors = new PrimeFactors();

    @Test
    void prime_factors_of_13195() {
        List<Integer> expected = Arrays.asList(5, 7, 13, 29);
        assertIterableEquals(expected, primeFactors.primeFactors(13195));
    }

    @Test
    void sqrt_of_200_is_14() {
        assertEquals(14, primeFactors.sqrt(200));
    }

    @Test
    void compute_simple() {
        assertEquals("29", primeFactors.compute("13195"));
    }

}
