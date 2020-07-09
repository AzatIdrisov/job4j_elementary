package ru.job4j.condition;

public class MultiMax {
    public static int max(int first, int second, int third) {
        int temp = first > second ? first : second;
        int result = temp > third ? temp : third;
        return result;
    }
}
