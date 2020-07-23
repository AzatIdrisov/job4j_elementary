package ru.job4j.array;

public class Merge {
    public static int[] merge(int[] left, int[] right) {
        int[] rsl = new int[left.length + right.length];
        int positionA = 0, positionB = 0;

        for (int i = 0; i < rsl.length; i++) {
            if (positionA == left.length) {
                rsl[i] = right[positionB];
                positionB++;
            } else if (positionB == right.length) {
                rsl[i] = left[positionA];
                positionA++;
            } else if (left[positionA] < right[positionB]) {
                rsl[i] = left[positionA];
                positionA++;
            } else {
                rsl[i] = right[positionB];
                positionB++;
            }
        }
        return rsl;
    }
}
