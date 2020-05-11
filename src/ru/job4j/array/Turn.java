package ru.job4j.array;

public class Turn {

//    public static int[] back(int[] array){
//        for (int i = 0; i < array.length / 2; i++) {
//            int temp = array[i];
//            array[i] = array[array.length - i - 1];
//            array[array.length - i - 1] = temp;
//        }
//        return array;
//    }

    public static int[] back(int[] array){

        int[] temp = new int[array.length];

        for (int i = 0; i < temp.length ; i++) {
            temp[i] = array[array.length - 1 - i];
        }

        return temp;
    }

}
