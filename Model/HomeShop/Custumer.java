package com.carriel.souleyman.Model.HomeShop;

public class Custumer {
    private String fullname;
    private String adresse;

    public Custumer(String pFullName, String pAdresse){
        this.fullname= pFullName;
        this.adresse=pAdresse;
        System.out.println("custumer créé "+fullname+", "+adresse);
    }

    public String getFullname() {
        return fullname;
    }

    public String getAdresse() {
        return adresse;
    }

}
