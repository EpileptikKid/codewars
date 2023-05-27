package org.example.kata_training.FindTheMissingLetter;


public class Kata {
    public static char findMissingLetter(char[] array) {
        return (char) ((array[0] + array[array.length - 1]) * (array.length + 1) / 2
                - new String(array).chars().sum());
    }

}
