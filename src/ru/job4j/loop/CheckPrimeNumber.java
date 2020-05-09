package ru.job4j.loop;

public class CheckPrimeNumber {

    public static boolean check(int num) {

        boolean numIsPrime = num > 1;

        for (int i = 2; i < num; i++){

            if (num % i == 0){

                numIsPrime = false;
                break;

            }

        }

        return numIsPrime;

    }

}
