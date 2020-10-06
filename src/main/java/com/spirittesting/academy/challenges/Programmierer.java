package com.spirittesting.academy.challenges;

import java.util.Arrays;
import java.util.SortedSet;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class Programmierer implements Challenge {
    @Override
    public String compute(String... options) {
        SortedSet<Integer> gehaelter = Arrays.stream(options).map(Integer::parseInt).collect(Collectors.toCollection(TreeSet::new));
        return Integer.toString(gehaelter.last() - gehaelter.first());
    }
}
