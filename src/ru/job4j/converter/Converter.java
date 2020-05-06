package ru.job4j.converter;

public class Converter {
    public static int rubleToEuro(int value) {
        int rsl = value / 70;
        return rsl;
    }
    public static int rubleToDollar(int value) {
        int rsl = value / 60;
        return rsl;
    }

    public static void main(String[] args) {

        int in = 140;
        int expected = 2;
        int out = rubleToEuro(in);
        boolean passed = expected == out;
        System.out.println("140 rubles are 2 Euros. Test result : " + passed);

        in = 120;
        expected = 2;
        out = rubleToDollar(in);
        passed = expected == out;
        System.out.println("120 rubles are 2 Dollars. Test result : " + passed);

//        int rubleToEuro = Converter.rubleToEuro(70);
//        int rubleToDollar = Converter.rubleToDollar(60);
//        System.out.println(rubleToEuro+" Евро\n"+rubleToDollar+" $");

    }
}
