package ru.job4j.converter;
/**
 * Класс для конвертации валюты.  Из рублей в доллары и евро.
 *
 * @author NazarAvilin
 */
public class Converter {
    /**
     * Метод перевода рублей в евро.
     * @param value - кол-во рублей.
     * @return rs1 - кол-во евро.
     */
    public static int rubleToEuro(int value) {
        int rsl = value / 70;
        return rsl;
    }
    /**
     * Метод перевода рублей в доллары.
     * @param value - кол-во рублей.
     * @return rs1 - кол-во долларов.
     */
    public static int rubleToDollar(int value) {
        int rsl = value / 60;
        return rsl;
    }

    /**
     * Main
     * @param args - args.
     */
    public static void main(String[] args) {

        int rubleToEuro = Converter.rubleToEuro(70);
        int rubleToDollar = Converter.rubleToDollar(60);
        System.out.println("70 Rubles = " + rubleToEuro+" Еuro\n60 Rubles = "+rubleToDollar+" $");

    }
}
