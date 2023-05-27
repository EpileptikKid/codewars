package org.example.kata_training.PersistentBugger;


import java.util.stream.IntStream;

public class Persist {
    public static int persistence(long n) {
        int result = 0;

        while (n >= 10) {
            n = Long.toString(n).chars().reduce(1, (r, i) -> r * (i - '0'));
            result++;
        }
        return result;
    }
}
