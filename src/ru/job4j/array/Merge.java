package ru.job4j.array;

public class Merge {
    public int[] merge(int[] left, int[] right) {

        int[] rsl = new int[left.length + right.length];

        for (int i = 0; i < left.length; i++){
            rsl[i] = left[i];
        }
        for (int i = 0; i < right.length; i++){
            rsl[left.length + i] = right[i];
        }


        return rsl;
    }

}
