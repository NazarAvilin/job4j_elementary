package ru.job4j.condition;

public class Max {

    public static int max(int left, int right) {
        boolean condition = left > right;
        int result = condition ? left : right;
        return result;
    }

    public static int summation(int first, int second) {
        int result = first + second;
        return result;
    }

    public static int totalMax(int max, int summation){
        max = max(max,summation);
        summation = summation(summation,max);
        boolean check = max > summation;
        int result = check ? max : summation;
        return result;
    }

}
