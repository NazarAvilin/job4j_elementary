package ru.job4j.loop;

public class Slash {

    public static void draw(int size) {

        for (int row = 1; row <= size; row++) {
            for (int cell = 1; cell <= size; cell++) {

                if (row == cell) { //Left
                    System.out.print("0");
                } else if ((row + cell) == (size + 1)) { //right
                    System.out.print("0");
                } else {
                    System.out.print(" ");
                }

            }

            System.out.println();

        }

        System.out.println();

    }

    public static void main(String[] args) {
        System.out.println("Draw by 3");
        draw(3);
        System.out.println("Draw by 5");
        draw(5);
    }

}
