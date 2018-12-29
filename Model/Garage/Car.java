package com.carriel.souleyman.Model.Garage;

import java.util.ArrayList;
import java.util.List;

public class Car extends Vehicule {
    private int door;
    private int litrePer100km;
    private String motor;

    public Car(String modelName, int year, String color, int speed, int weight, double prix, int door, int litrePer100km, String motor) {
        super(modelName, year, color, speed, weight, prix);
        this.door = door;
        this.litrePer100km = litrePer100km;
        this.motor = motor;
    }



    public int getDoor() {
        return door;
    }

    public int getLitrePer100km() {
        return litrePer100km;
    }

    public String getMotor() {
        return motor;
    }




}

