package ru.job4j.condition;

public class AlertDivByZero {

    public static void possibleDiv(int number) {
        boolean result = number < 0;
        if (result) {
            System.out.println("This is negative numbers.");
        }
    }

    public static void main(String[] args) {
        possibleDiv(-1);
    }
}
