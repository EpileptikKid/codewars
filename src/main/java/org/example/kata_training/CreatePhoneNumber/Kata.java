package org.example.kata_training.CreatePhoneNumber;

public class Kata {
    public static String createPhoneNumber(int[] numbers) {
        String result = new String("(xxx) xxx-xxxx");

        for (int i : numbers) {
            result = result.replaceFirst("x", Integer.toString(i));
        }

        return result;
    }
}
