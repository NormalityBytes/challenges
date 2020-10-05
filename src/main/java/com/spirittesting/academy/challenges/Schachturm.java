package com.spirittesting.academy.challenges;

public class Schachturm implements Challenge {
    @Override
    public String compute(String... options) {
        String turm1 = options[0];
        String turm2 = options[1];

        return Boolean.toString(turm1.charAt(0) == turm2.charAt(0) || turm1.charAt(1) == turm2.charAt(1));
    }
}
