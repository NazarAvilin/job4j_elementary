package ru.job4j.array;

import java.util.Arrays;

/**
 * метод для переставки элементы массива!
 */
public class AlgoArray {
    public static void main(String[] args) {
        int[] array = new int[] {5, 3, 2, 1, 4};
        int temp = array[0];
        array[0] = array[3];
        array[3] = temp;
        for (int index = 0; index < array.length; index++) {
            System.out.println(array[index]);
        }
        System.out.println();
        temp = array[1];
        array[1] = array[2];
        array[2] = temp;
        temp = array[3];
        array[3] = array[4];
        array[4] = temp;
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
