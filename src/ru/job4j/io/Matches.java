package ru.job4j.io;

import java.util.Scanner;

public class Matches {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int count = 11;
        boolean select = true;
        String player;
        while (count > 0) {
            player = select ? "Первый" : "Второй";
            System.out.print(player + " игрок берет спички ");
            int size = Integer.parseInt(input.nextLine());
            if (size > 3 || size < 0) {
                System.out.println("Нужно взять от 1 до 3 спичек. Повторите попытку...");
            } else {
                count -= size;
                if (count < 0) {
                    System.out.println("Нужно взять не больше чем то что осталось! Игра завершена.");
                } else {
                    System.out.println("Осталось " + count + " cпичек");
                    select = !select;
                }
            }
        }
        player = select ? "Второй игрок выиграл! Поздравляем" : "Первый игрок выиграл! Поздравляем";
        System.out.println(player);
    }

}
