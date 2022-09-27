package com.gmail.at.kotamadeo;

import java.util.Random;

import static java.util.Arrays.stream;

public class ArrayUtils {
    private static final Random RANDOM = new Random();

    private ArrayUtils() {
    }

    public static int[] arrayInit(int length) {
        int[] result = new int[length];
        for (int i = 0; i < result.length; i++) {
            result[i] = RANDOM.nextInt(100);
        }
        return result;
    }

    public static int arraySum(int[] array, boolean isParallel) {
        return isParallel ? stream(array).parallel().sum() : stream(array).sum();
    }

    public static double arrayAverage(int[] array, boolean isParallel) {
        return isParallel ? stream(array).parallel().average().orElseThrow(IllegalArgumentException::new)
                : stream(array).average().orElseThrow(IllegalArgumentException::new);
    }
}
