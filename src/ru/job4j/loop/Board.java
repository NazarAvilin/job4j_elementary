package ru.job4j.loop;

public class Board {

    public static void chessBoard(int width, int height){

        for (int i = 0; i < height; i++){
            for (int j = 0; j < width; j++){
                if ((i+j) % 2 == 0){
                    System.out.print("X");
                }else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {

        chessBoard(3,3);
        System.out.println();
        chessBoard(4,4);

    }

}
