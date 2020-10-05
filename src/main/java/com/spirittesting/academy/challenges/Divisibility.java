package com.spirittesting.academy.challenges;

import java.util.Collection;
import java.util.stream.LongStream;

import com.spirittesting.academy.challenges.math.MathUtils;

public class Divisibility implements Challenge {

    @Override
    public String compute(String... options) {
        int max = Integer.parseInt(options[0]);
        return Long.toString(leastCommonMultipleUpTo(max));
    }

	public long leastCommonMultipleUpTo(int max) {
        long[] range = new long[max];
        for (int i = 0; i < max; i++) { range[i] = i + 1; }
        return MathUtils.leastCommonMultiple(range);
    }
    
}
