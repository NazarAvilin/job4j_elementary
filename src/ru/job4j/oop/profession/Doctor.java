package ru.job4j.oop.profession;

public class Doctor extends Profession {
    private String certificate;

    public String getCertificate() {
        return certificate;
    }

    public void setCertificate(String certificate) {
        this.certificate = certificate;
    }

    public String diagnoses(Patients patient) {
        Patients patients = new Patients();
        return patients.getDiagnoses();
    }

}