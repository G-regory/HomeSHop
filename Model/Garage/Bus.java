package com.carriel.souleyman.Model.Garage;

import java.util.List;

public class Bus extends Car {



    public Bus(String modelName, String description, String manufacturer, int year, String color, int speed, int[] dimensions, int weight, int door, int litrePer100km, String motor, List<String> option) {
        super(modelName, description, manufacturer, year, color, speed, dimensions, weight, door, litrePer100km, motor, option);

    }


}
