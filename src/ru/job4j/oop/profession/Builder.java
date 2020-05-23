package ru.job4j.oop.profession;

public class Builder extends Engineer {
    private String buildingName;

    public String getBuildingName() {
        return buildingName;
    }

    public void setBuildingName(String buildingName) {
        this.buildingName = buildingName;
    }

    private String workPlan(Clients client) {
        return buildingName;
    }

}