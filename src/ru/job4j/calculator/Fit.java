package ru.job4j.calculator;

public class Fit {

    public static double manWeight(Double height){
        double ideal = height - 100;
        return ideal;
    }

    public static double womanWeight(Double height){
        double ideal = height - 110;
        return ideal;
    }

    public static void main(String[] args) {
        double manWeight = Fit.manWeight(180d);
        double womanWeight = Fit.manWeight(165d);
        System.out.println("Идеальный вес мужчины с ростом 180см = "+
                manWeight + " \nИдеальный вес женщины с ростом 165см = "+womanWeight);
    }

}
