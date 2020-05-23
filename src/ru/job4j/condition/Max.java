package ru.job4j.condition;

public class Max {

    public static int max(int first, int second) {
        return first > second ? first : second;
    }

    public static int max(int first, int second, int third) {
        return max(max(first, second), third);
    }

    public static int max(int first, int second, int third, int fourth) {
        return max(max(first, second, third), fourth);
    }

    public static int summation(int first, int second) {
        int result = first + second;
        return result;
    }

    public static int totalMax(int max, int summation) {
        max = max(max, summation);
        summation = summation(summation, max);
        boolean check = max > summation;
        int result = check ? max : summation;
        return result;
    }

}
