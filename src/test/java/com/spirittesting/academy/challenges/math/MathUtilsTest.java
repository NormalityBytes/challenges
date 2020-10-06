package com.spirittesting.academy.challenges.math;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class MathUtilsTest {

    @Test
    void gcd_of_10_and_15_is_5() {
        assertEquals(5, MathUtils.greatestCommonDivisor(10, 15));
    }

    @Test
    void gcd_of_15_and_10_is_5() {
        assertEquals(5, MathUtils.greatestCommonDivisor(15, 10));
    }

    @Test
    void lcm_of_4_and_5_is_20() {
        assertEquals(20, MathUtils.leastCommonMultiple(4, 5));
    }

    @Test
    void lcm_of_4_5_and_6_is_60() {
        assertEquals(60, MathUtils.leastCommonMultiple(4L, 5L, 6L));
    }

    @Test
    void lcm_of_20_and_40_is_40() {
        assertEquals(40, MathUtils.leastCommonMultiple(20, 40));
    }

    @Test
    void lcm_of_1_through_10_is_2520() {
        assertEquals(2520, MathUtils.leastCommonMultiple(2,3,4,5,6,7,8,9,10));
    }
}
