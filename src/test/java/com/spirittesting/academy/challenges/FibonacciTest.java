package com.spirittesting.academy.challenges;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertIterableEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

public class FibonacciTest {

    Fibonacci fibonacci = new Fibonacci();

    @Test
    void fib6_is_13() {
        assertEquals(13, fibonacci.fib(6));
    }

    @Test
    void sum_up_to_fib6_is_32() {
        assertEquals(32, fibonacci.sumTo(6));
    }

    @Test
    void list_up_to_fib6() {
        List<Long> fibs = Arrays.asList(1L, 2L, 3L, 5L, 8L, 13L);
        assertIterableEquals(fibs, fibonacci.listTo(6));
    }

    @Test
    void list_until_larger_than_10() {
        List<Long> fibs = Arrays.asList(1L, 2L, 3L, 5L, 8L);
        assertEquals(fibs, fibonacci.listUntil(10));
    }

    @Test
    void compute_100_is_44() {
        assertEquals("44", fibonacci.compute("100"));
    }

}
