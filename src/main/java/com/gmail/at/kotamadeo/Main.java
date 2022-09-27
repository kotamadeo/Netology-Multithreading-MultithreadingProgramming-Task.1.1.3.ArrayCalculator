package com.gmail.at.kotamadeo;

import java.util.Arrays;

import static com.gmail.at.kotamadeo.ArrayUtils.*;
import static java.lang.System.currentTimeMillis;

public class Main {
    public static void main(String[] args) {
        int[] array = arrayInit(10);
        System.out.println(Arrays.toString(array));
        decision(array);
        parallelDecision(array);
    }

    private static void parallelDecision(int[] array) {
        long start = currentTimeMillis();
        System.out.println("Сумма - " + arraySum(array, true));
        System.out.println("Среднее значение - " + arrayAverage(array, true));
        long end = currentTimeMillis();
        System.out.printf("Затраченное время - %d мс.%n", end - start);
    }

    private static void decision(int[] array) {
        long start = currentTimeMillis();
        System.out.println("Сумма - " + arraySum(array, false));
        System.out.println("Среднее значение - " + arrayAverage(array, false));
        long end = currentTimeMillis();
        System.out.printf("Затраченное время - %d мс.%n", end - start);
    }
}