package com.spirittesting.academy.challenges;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SchachturmTest {

    @Test
    void gleicheZeile() { assertTrue( Boolean.parseBoolean(new Schachturm().compute("F3", "A3"))); }
    @Test void gleicheSpalte() { assertTrue( Boolean.parseBoolean(new Schachturm().compute("F7", "F3"))); }
    @Test void kannNichtSchlagen() { assertFalse( Boolean.parseBoolean(new Schachturm().compute("F7", "D3"))); }

}
