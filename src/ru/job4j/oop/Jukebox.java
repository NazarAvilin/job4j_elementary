package ru.job4j.oop;

public class Jukebox {

    public void music(int position) {
        String letRun = "Пусть бегут неуклюже," + System.lineSeparator()
                        + "Пешеходы по лужам," + System.lineSeparator()
                        + "А вода по асфальту рекой." + System.lineSeparator()
                        + "И неясно прохожим," + System.lineSeparator()
                        + "В этот день непогожий," + System.lineSeparator()
                        + "Почему я веселый такой.";
        String goodNight = "Спят усталые игрушки, книжки спят." + System.lineSeparator()
                           + "Одеяла и подушки ждут ребят." + System.lineSeparator()
                           + "Даже сказка спать ложится," + System.lineSeparator()
                           + "Чтобы ночью нам присниться." + System.lineSeparator()
                           + "Ты ей пожелай: " + System.lineSeparator() + "Баю-бай.";
        if (position == 1) {
            System.out.println(letRun);
        } else if (position == 2) {
            System.out.println(goodNight);
        } else {
            System.out.println("Песня не найдена");
        }
    }

    public static void main(String[] args) {
        Jukebox getSong = new Jukebox();
        getSong.music(2);

    }
}
