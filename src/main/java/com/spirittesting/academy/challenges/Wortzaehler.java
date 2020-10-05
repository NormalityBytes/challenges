package com.spirittesting.academy.challenges;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Wortzaehler implements Challenge {
    @Override
    public String compute(String... options) {
        String text = Arrays.stream(options).map(String::trim).collect(Collectors.joining(" "));
        return Long.toString(Arrays.stream(text.split("\\s")).filter(string -> !string.isBlank()).count());
    }
}
