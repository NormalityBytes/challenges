package com.spirittesting.academy.challenges;

public class Landwirt implements Challenge {
    @Override
    public String compute(String... options) {
        int huehner = Integer.parseInt(options[0]);
        int schweine = Integer.parseInt(options[1]);
        int kuehe = Integer.parseInt(options[2]);
        return Integer.toString(huehner * 2 + schweine * 4 + kuehe * 4);
    }
}
