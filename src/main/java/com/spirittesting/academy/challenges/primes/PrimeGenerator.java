package com.spirittesting.academy.challenges.primes;

import java.util.LinkedList;
import java.util.List;

public class PrimeGenerator {

    private final LinkedList<Long> primes = new LinkedList<>();

    public PrimeGenerator() {
        SieveOfErathosthenes sieveOfErathosthenes = new SieveOfErathosthenes(10000);
        sieveOfErathosthenes.getPrimes().forEach(prime -> primes.add(Long.valueOf(prime)));
    }

    public List<Long> getFirstNPrimes(int n) {
        while (n > primes.size()) { findNextPrime(); }
        return primes.subList(0, n);
    }

    public Long getPrime(int index) {
        while (primes.size() < index) findNextPrime();
        return primes.get(index - 1);
    }

    private void findNextPrime() {
        long candidate = primes.getLast();
        do { candidate += 2; } while (!isPrime(candidate));
        primes.add(candidate);
    }

    private boolean isPrime(long candidate) {
        double sqrt = Math.sqrt(candidate);
        for (long prime : primes) {
            if (prime > sqrt) return true;
            if (candidate % prime == 0) return false;
        }
        return true;
    }

}
