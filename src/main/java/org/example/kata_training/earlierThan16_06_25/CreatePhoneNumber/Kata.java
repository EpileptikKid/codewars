package org.example.kata_training.earlierThan16_06_25.CreatePhoneNumber;

public class Kata {
    public static String createPhoneNumber(int[] numbers) {
        String result = new String("(xxx) xxx-xxxx");

        for (int i : numbers) {
            result = result.replaceFirst("x", Integer.toString(i));
        }

        return result;
    }
}
