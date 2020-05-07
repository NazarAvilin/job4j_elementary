package ru.job4j.condition;

public class Triangle {

    public static boolean exist(double ab, double ac, double bc) {
        boolean result = false;
        if (ab > ac && ab > bc){
            result = true;
        }else if (ab == ac && ab == bc) {
            result = false;
        }
        System.out.println(result);
        return result;
    }


    public static void main(String[] args) {
        exist(6,3,4);
    }

}
