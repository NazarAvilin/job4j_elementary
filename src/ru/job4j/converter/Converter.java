package ru.job4j.converter;

public class Converter {
    public static int rubleToEuro(int value) {
        int rsl = value * 70;
        return rsl;
    }
    public static int rubleToDollar(int value) {
        int rsl = value * 60;
        return rsl;
    }

    public static void main(String[] args) {
        int rubleToEuro = Converter.rubleToEuro(100);
        int rubleToDollar = Converter.rubleToDollar(100);
        System.out.println(rubleToEuro+" Рублей\n"+rubleToDollar+" Рублей");

    }
}
