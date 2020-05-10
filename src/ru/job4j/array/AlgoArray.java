package ru.job4j.array;

import java.util.Arrays;


public class AlgoArray {
    public static void main(String[] args) {
        int[] array = new int[] {5, 3, 2, 1, 4};
        int temp = array[0]; // переменная для временного хранения значение ячейки с индексом 0.
        array[0] = array[3]; // записываем в ячейку с индексом 0 значение ячейки с индексом 3.
        array[3] = temp; // записываем в ячейку с индексом 3 значение временной переменной.

        for (int index = 0; index < array.length; index++) {
            System.out.println(array[index]);
        }

        System.out.println();

        Arrays.sort(array);

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }


    }
}
