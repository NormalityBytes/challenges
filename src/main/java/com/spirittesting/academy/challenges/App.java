package com.spirittesting.academy.challenges;

public class App {

    /** Enthält die umgesetzten Übungen mit Parametern.  */
    public enum Challenges {

        Fibonacci(Fibonacci.class, "4000000"),
        PrimeFactors(PrimeFactors.class, "600851475143"),
        Palindrome(Palindrome.class, "3"),
        //Divisibility(Divisibility.class, "20"),
        PrimesByIndex(PrimesByIndex.class, "10001"),
        Landwirt(Landwirt.class, "2", "3", "5"),
        Wortzaehler(Wortzaehler.class, "Das war doch einfach,", "oder?"),
        Schach(Schachturm.class, "A4", "C5"),
        Programmierer(Programmierer.class, "90", "35", "50");

        /** Die Klasse, in der die Lösung implementiert ist. */
        Class<? extends Challenge> challengeClass;
        /** Die Parameter für die Übungsaufgabe */
        String[] options;

        Challenges(Class<? extends Challenge> challenge, String... options) {
            this.challengeClass = challenge;
            this.options = options;
        }

        /** Führt die Aufgabe aus und gibt die Lösung zusammen mit der benötigten Zeit aus. */
        String run() {
            try {
                Challenge challenge = challengeClass.getConstructor().newInstance();
                long time = System.currentTimeMillis();
                String result = challenge.compute(options);
                return String.format("%-20s: [%-20s] (%dms)", 
                        challengeClass.getSimpleName(), 
                        result,
                        System.currentTimeMillis() - time);
            } catch (Throwable e) {
                e.printStackTrace();
                return "Failed to run " + challengeClass.getName();
            }
        }
    }

    /** Führt alle Übungen aus. Gibt Übung, Lösung und benötigte Zeit aus. */
    public static void main(String[] args) {
        System.out.println("============");
        System.out.println("=CHALLENGES=");
        System.out.println("============");
        for (Challenges challenge : Challenges.values()) {
            System.out.println(challenge.run());
        }
    }
}
