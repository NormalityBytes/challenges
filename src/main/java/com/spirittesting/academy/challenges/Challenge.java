package com.spirittesting.academy.challenges;

public interface Challenge {
    
    /** Führt die eigentliche Aufgabe aus. Notwendige Parameter werden in <code>options</code> übergeben. */
    String compute(String... options);

}
