package com.spirittesting.academy.challenges;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class DivisibilityTest {
    
    Divisibility divisibility = new Divisibility();

    @Test
    void compute() {
        assertEquals("2520", divisibility.compute("10"));
    }

    @Test void least_common_multiple_of_1_through_10_is_2520() {
        assertEquals(2520, divisibility.leastCommonMultipleUpTo(10));
    }


}
