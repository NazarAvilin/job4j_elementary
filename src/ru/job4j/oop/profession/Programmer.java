package ru.job4j.oop.profession;

public class Programmer extends Engineer {
    private String projectName;

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public String programName(Clients client) {
        return getProjectName();
    }
}