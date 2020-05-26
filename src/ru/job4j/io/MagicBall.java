package ru.job4j.io;

import java.util.Random;
import java.util.Scanner;

public class MagicBall {
    public static void main(String[] args) {
        Scanner name = new Scanner(System.in);
        System.out.println("Он- Как тебя Зовут?");
        System.out.print("Я - Меня зовут ");
        String myName = name.next();
        System.out.println("Он - Я великий Оракул. Что " + myName + " хочешь узнать? ");
        System.out.print("Я - Хочу узнать ");
        name.next();
        int answer = new Random().nextInt(3);
        if (answer == 1) {
            System.out.println("Да");
        } else if (answer == 2) {
            System.out.println("Нет");
        } else {
            System.out.println("Может быть");
        }
    }
}
