package ru.job4j.oop.profession;

public class Clients extends Engineer {
    private String clientsName;
    private String clientsAddress;

    public String getClientsName() {
        return clientsName;
    }

    public void setClientsName(String clientsName) {
        this.clientsName = clientsName;
    }

    public String getClientsAddress() {
        return clientsAddress;
    }

    public void setClientsAddress(String clientsAddress) {
        this.clientsAddress = clientsAddress;
    }
}
