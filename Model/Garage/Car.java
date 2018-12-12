package com.carriel.souleyman.Model.Garage;

import java.util.ArrayList;
import java.util.List;

public class Car extends Vehicule {
    int door;
    int litrePer100km;
    String motor;
    List<String> option = new ArrayList<>();

    public Car(String modelName, String description, String manufacturer, int year, String color, int speed, int[] dimensions, int weight, int door, int litrePer100km, String motor, List<String> option) {
        super(modelName, description, manufacturer, year, color, speed, dimensions, weight);
        this.door = door;
        this.litrePer100km = litrePer100km;
        this.motor = motor;
        this.option = option;
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

    public List<String> getOption() {
        return option;
    }
}

