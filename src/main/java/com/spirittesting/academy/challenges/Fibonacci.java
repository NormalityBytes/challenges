package com.spirittesting.academy.challenges;

import java.util.*;

public class Fibonacci implements Challenge {

    /** Enthält die bisher berechneten Fibonaccizahlen. <code>sequence.get(0)</code> entspricht <code>fib(1)</code> */
    private final List<Long> sequence = new ArrayList<>(Arrays.asList(1L, 2L));

    /** Berechnet die Fibonaccizahl mit Index <code>i</code>. */
    public Long fib(int i) {
        if (sequence.size() < i) {
            sequence.add(fib(i - 2) + fib(i - 1));
        }
        return sequence.get(i - 1);
    }

    /** Summiert die ersten <code>i</code> Fibonaccizahlen. */
    public Long sumTo(int i) {
        return listTo(i).stream().reduce(Long::sum).get();
    }

    /** Erzeugt eine Liste der Fibonaccizahlen von fib(1) bis fib(i). */
    public List<Long> listTo(int i) {
        fib(i);
        return sequence.subList(0, i);
    }

    /** Erzeugt eine Liste aller Fibonaccizahlen, deren Wert kleiner ist als <code>maxValue</code>. */
    public List<Long> listUntil(long maxValue) {
        int i = 2;
        while (sequence.get(sequence.size() - 1) < maxValue) fib(i++);
        return sequence.subList(0, i - 2);
    }

    @Override
    public String compute(String... options) {
        Long maxValue = Long.parseLong(options[0]);
        return listUntil(maxValue).stream()
                .filter(i -> i % 2 == 0)
                .reduce(Long::sum)
                .get()
                .toString();
    }

}
