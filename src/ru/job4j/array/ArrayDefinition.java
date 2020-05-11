package ru.job4j.array;

public class ArrayDefinition {

    public static void main(String[] args) {

        short[] ages = new short[10];

        String[] surnames = new String[100500];

        float[] prices = new float[40];

        String[] names = new String[4];
        names[0] = "Арсентьев Пётр" + System.lineSeparator();
        names[1] = "Шамсемухаметов Раиль" + System.lineSeparator();
        names[2] = "Коробеиников Стас" + System.lineSeparator();
        names[3] = "Авилин Назар";

        System.out.println(names[0] + names[1] + names[2] + names[3]);

    }

}
