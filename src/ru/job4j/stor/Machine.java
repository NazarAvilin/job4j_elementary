package ru.job4j.stor;

import java.util.Arrays;

public class Machine {

    private final int[] COINS = {10, 5, 2, 1};

    public int[] change(int money, int price) {
        int[] rsl = new int[100];
        int size = 0;
        int result = money - price;
        for (int coin : COINS) {
            while (result >= coin) {
                result = result - coin;
                rsl[size] = coin;
                size++;
            }
        }
        return Arrays.copyOf(rsl, size);
    }
}
