package ru.job4j.pojo;

import java.util.Date;

public class College {

    public static void main(String[] args) {
        Student student = new Student();
        student.setFullName("Nazar M. Avilin");
        student.setGroup("Last-A1");
        student.setStart("01.09.2019");
        System.out.println("Full Name: " + student.getFullName() + System.lineSeparator()
                           + "Group: " + student.getGroup() + System.lineSeparator()
                           + "Starting date: " + student.getStart());
    }

}
