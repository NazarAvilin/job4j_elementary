package ru.job4j.io;

import java.util.Scanner;

public class Matches {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean run = true;
        int count = 11;
        System.out.println("Ход первого игрока. Возьмите спички от 1 до 3 штук");
        while (run) {
            int select = Integer.parseInt(input.nextLine());
            if (select > 0 && select < 4) {
                count = count - select;
                if (count <= 0) {
                    System.out.println("Игра завершена. Последний кто взял, тот и выиграл! Поздравляем");
                    run = false;
                } else {
                    System.out.println("На столе осталось:" + count + " спичек");
                    System.out.println("Ход второго игрока. Возьмите спички от 1 до 3 штук");
                }
            } else {
                System.out.println("Нужно взять от 1 до 3 спичек. Игра звершена. Начните сначала");
                run = false;
            }
        }
    }

}
