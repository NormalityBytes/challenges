package com.spirittesting.academy.challenges;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WortzaehlerTest {

    @Test void leererText() {assertEquals("0", new Wortzaehler().compute("")); }
    @Test void fuenfWorte() {assertEquals("5", new Wortzaehler().compute("Das war doch einfach, oder?")); }

}
