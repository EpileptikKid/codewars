package org.example.kata_training.earlierThan16_06_25.OnesAndZeros;

import java.util.List;

public class BinaryArrayToNumber {
    public static int ConvertBinaryArrayToInt(List<Integer> binary) {
        return binary.stream().reduce((x, y) -> x*2 + y).get();
    }
}
