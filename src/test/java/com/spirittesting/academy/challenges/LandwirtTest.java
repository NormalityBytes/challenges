package com.spirittesting.academy.challenges;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LandwirtTest {

    @Test
    void nurHuehner() { assertEquals("200", new Landwirt().compute("100", "0", "0")); }

    @Test
    void nurSchweine() { assertEquals("200", new Landwirt().compute("0", "50", "0")); }

    @Test
    void nurKuehe() { assertEquals("200", new Landwirt().compute("0", "0", "50")); }

    @Test
    void gemischt() { assertEquals("600", new Landwirt().compute("100", "50", "50")); }
}
