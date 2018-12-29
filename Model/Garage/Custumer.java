package com.carriel.souleyman.Model.Garage;

public class Custumer {
    private String fullName;
    private String adresse;



    public Custumer(String fullName, String adresse) {
        this.fullName = fullName;
        this.adresse = adresse;
    }

    public String getFullName() {
        return fullName;
    }

    public String getAdresse() {
        return adresse;
    }
}
