package ru.job4j.condition;

public class Triangle {
    //Нужно проверить, что ab + ac > bc и ac + bc > ab и ab + bc > ac - в этом случае треугольник существует.
    public static boolean exist(double ab, double ac, double bc) {
        boolean result = ab + ac > bc && ac + bc > ab && ab + bc > ac ? true : false;
        return result;
    }

}
