package org.example.kata_training.date16_06_25.PlayingWithPassphrases;

public class PlayingWithPassphrases {

    public static String playPass(String str, int n) {
        String result = "";
        int[] av = str.toUpperCase().chars().map(ch -> {
            if (Character.isAlphabetic(ch)) {
                return (char) (ch + n) - (ch + n > 90 ? 26 : 0);
            } else if (Character.isDigit(ch)) {
                return (char) 48 + 57 - ch;
            } else return ch;
        }).toArray();
        for (int i = 0; i < av.length; i++) {
            if (i % 2 == 1 && Character.isAlphabetic((char) av[i])) {
                av[i] = (char) (av[i] + 32);
            }
        }
        for (int i = av.length - 1; i >= 0; i--) {
            result += (char) av[i];
        }
        return result;
    }
}
