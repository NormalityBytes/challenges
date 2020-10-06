package com.spirittesting.academy.challenges;

import com.spirittesting.academy.challenges.primes.PrimeGenerator;
import com.spirittesting.academy.challenges.primes.SieveOfErathosthenes;

public class PrimesByIndex implements Challenge {

    @Override
    public String compute(String... options) {
        int index = Integer.parseInt(options[0]);
        return Long.toString(new PrimeGenerator().getPrime(index));
    }

}
