package ru.job4j.oop.profession;

public class Surgeon extends Doctor {
    private String hospitalName;

    public String getHospital() {
        return hospitalName;
    }

    public void setHospital(String hospital) {
        this.hospitalName = hospital;
    }
}