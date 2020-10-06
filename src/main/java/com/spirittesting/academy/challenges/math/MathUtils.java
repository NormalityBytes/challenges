package com.spirittesting.academy.challenges.math;

import java.util.*;
import java.util.stream.LongStream;

public class MathUtils {

    public static long greatestCommonDivisor(long a, long b) {
        return gcd(Math.max(a, b), Math.min(a, b));
    }

    public static long floorOfSqrt(long a) {
        return 0;
    }

    private static long gcd(long a, long b) {
        if (b == 0)
            return a;
        return gcd(a > b ? a - b : a, a > b ? b : b - a);
    }

    public static long leastCommonMultiple(long... inputs) {
        long[] values = Arrays.copyOf(inputs, inputs.length);
        while (!isAllSame(values)) {
            int smallestIndex = indexOfSmallestValue(values);
            values[smallestIndex] += inputs[smallestIndex];
        }
        return values[0];
    }

    private static boolean isAllSame(long[] array) {
        for (long l : array) {
            if (l != array[0])
                return false;
        }
        return true;
    }

    private static int indexOfSmallestValue(long[] array) {
        long smallestValue = Long.MAX_VALUE;
        int smallestIndex = -1;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < smallestValue) {
                smallestValue = array[i];
                smallestIndex = i;
            }
        }
        return smallestIndex;
    }

    public static List<Long> getPrimeFactors(Long value) {
        List<Long> primes = findPrimesLessThan(Math.sqrt((double) value));
        return getPrimeFactors(value, new ArrayList<Long>(), primes);
    }

    private static List<Long> getPrimeFactors(Long value, List<Long> factorsFound, List<Long> primes) {
        if (value == 1L)
            return factorsFound;
        for (Long prime : primes) {
            if (value % prime == 0) {
                factorsFound.add(prime);
                return getPrimeFactors(value / prime, factorsFound, primes);
            }
        }
        factorsFound.add(value);
        return factorsFound;
    }

    public static List<Long> findPrimesLessThan(double value) {
        List<Long> primes = new ArrayList<>(Collections.singletonList(2L));
        for (long i = 3; i < value; i += 2) {
            if (isPrime(i))
                primes.add(i);
        }
        return primes;
    }

    public static boolean isPrime(long number) {
        return number > 1 && LongStream.rangeClosed(2, (long) Math.sqrt(number)).noneMatch(n -> (number % n == 0));
    }

}
