package org.example.kata_training.earlierThan16_06_25.DisemvowelTrolls;

public class Troll {
    public static String disemvowel(String str) {
        return str.replaceAll("(?i)[aeiou]", "");
    }
}
