package ru.job4j.calculator;

public class Calculator {

    public static void main(String[] args) {
        int first,second,one,two,four,
            five,six,result,onePlusTow,sixDivTow,
            fiveMinusTwo,fourTimeTwo;
        first = 1;
        second = 2;
        one = 1;
        two = 2;
        four = 4;
        five = 5;
        six = 6;
        result = first + second;
        onePlusTow = one + two;
        sixDivTow = six / two;
        fiveMinusTwo = five - two;
        fourTimeTwo = four * two;

        System.out.println(result);
        System.out.println(onePlusTow);
        System.out.println(sixDivTow);
        System.out.println(fiveMinusTwo);
        System.out.println(fourTimeTwo);

    }

}
