package ru.job4j.calculator;

public class Fit {

    @SuppressWarnings("checkstyle:WhitespaceAround")
    public static double manWeight(Double height){
        double ideal = ((height - 100) * 1.15d);
        return ideal;
    }

    public static double womanWeight(Double height){
        double ideal = ((height - 110) * 1.15d);
        return ideal;
    }

    public static void main(String[] args) {
        double manWeight = Fit.manWeight(180d);
        double womanWeight = Fit.manWeight(165d);
        System.out.println("Идеальный вес мужчины с ростом 180см = " +
                            manWeight + " \nИдеальный вес женщины с ростом 165см = "
                            + womanWeight);
    }

}
