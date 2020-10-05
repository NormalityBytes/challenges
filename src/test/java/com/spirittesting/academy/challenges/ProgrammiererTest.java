package com.spirittesting.academy.challenges;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProgrammiererTest {

    @Test
    void beispiel1() { assertEquals("50", new Programmierer().compute("50", "75", "100")); }

    @Test
    void beispiel2() { assertEquals("50", new Programmierer().compute("100", "75", "50")); }

    @Test
    void beispiel3() { assertEquals("50", new Programmierer().compute("75", "100", "50")); }

    @Test
    void beispiel4() { assertEquals("0", new Programmierer().compute("100", "100", "100")); }

}
