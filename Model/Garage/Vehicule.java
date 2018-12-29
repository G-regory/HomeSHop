package com.carriel.souleyman.Model.Garage;

public class Vehicule {

    private String modelName;
    private int year;
    private String color;
    private int maxSpeed;
    private int weight;
    private double prix;

    public Vehicule(String modelName, int year, String color, int maxSpeed, int weight, double prix) {
        this.modelName = modelName;
        this.year = year;
        this.color = color;
        this.maxSpeed = maxSpeed;
        this.weight = weight;
        this.prix= prix;
    }

    public void start() {
        System.out.println("Je suis " + modelName + " et je  démarre");
    }

    public void stop() {
        System.out.println("Je suis " + modelName + " et je m'arrête");
    }

//    --------getters------------

    public String getModelName() {
        return modelName;
    }

    public int getYear() {
        return year;
    }

    public String getColor() {
        return color;
    }

    public int getWeight() {
        return weight;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public double getPrix() {
        return prix;
    }

    public String getInfo(){
        return getModelName()+" - "+ getColor()+" - "+getYear();
    }
}
