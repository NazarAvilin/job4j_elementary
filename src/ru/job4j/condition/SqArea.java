package ru.job4j.condition;

public class SqArea {
    public static double square(int p, int k) {
        double L, h, s;
        h = p / (2 * (k + 1));

        L = h * k;

        s = L * h;

        h = s/L;

        return h;
    }

    public static void main(String[] args) {
        double result1 = SqArea.square(4, 1);
        System.out.println(" p = 4, k = 1, s = 1, real = " + result1);
    }
}
