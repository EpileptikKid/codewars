package org.example.kata_training.earlierThan16_06_25.SplitStrings;

public class StringSplit {
    public static String[] solution(String s) {
        return (s.length() % 2 != 0 ? s + "_" : s).split("(?<=\\G.{2})");
    }
}
