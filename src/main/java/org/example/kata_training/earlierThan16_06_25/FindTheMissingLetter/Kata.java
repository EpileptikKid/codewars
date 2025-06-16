package org.example.kata_training.earlierThan16_06_25.FindTheMissingLetter;


public class Kata {
    public static char findMissingLetter(char[] array) {
        return (char) ((array[0] + array[array.length - 1]) * (array.length + 1) / 2
                - new String(array).chars().sum());
    }

}
