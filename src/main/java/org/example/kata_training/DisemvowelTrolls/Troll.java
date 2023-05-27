package org.example.kata_training.DisemvowelTrolls;

public class Troll {
    public static String disemvowel(String str) {
        return str.replaceAll("(?i)[aeiou]", "");
    }
}
