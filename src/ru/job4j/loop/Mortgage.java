package ru.job4j.loop;

public class Mortgage {

    public int year(int amount, int salary, double percent) {

        int year = 0;
        double dept = amount;

        while (dept > 0) {
            year++;
            dept = dept * percent / 100 + dept - salary;
        }
        return year;
    }

}
