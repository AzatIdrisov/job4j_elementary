package ru.job4j.array;

public class CrossArray {
    public static void printCrossEl(int[] left, int[] right) {
        String elements = "";
        for (int i = 0; i < left.length; i++) {
            for (int j = 0; j < right.length; j++) {
                if (left[i] == right[j] && !elements.contains(Integer.toString(left[i]))) {
                    elements += left[i] + System.lineSeparator();
                }
            }
        }
        for (int i = 0; i < elements.length() - 2; i++) {
            System.out.print(elements.charAt(i));
        }
    }
}
