package ru.job4j.array;

import java.util.Arrays;

public class Merge {

    public int[] merge(int[] left, int[] right) {

        int[] rsl = new int[left.length + right.length];
        int i = 0, j = 0;

        while (i < left.length && j < right.length) {
            if (left[i] > right[j]) {
                rsl[i + j] = right[j];
                j++;
            } else {
                rsl[i + j] = left[i];
                i++;
            }
        }

        while (i + j < left.length + right.length) {
            if (i == left.length){
                rsl[i + j] = right[j];
                j++;
            } else {
                rsl[i + j] = left[i];
                i++;
            }
        }

        return rsl;
    }


    public static void main(String[] args) {
        Merge process = new Merge();
        int[] rsl = process.merge(
                new int[] {1, 3, 5},
                new int[] {4, 8,}
        );
        System.out.println(Arrays.toString(rsl));
    }

}
