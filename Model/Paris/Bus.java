package com.carriel.souleyman.Model.Paris;

public class Bus implements Transport {
    @Override
    public void seDeplace(String adresse) {
        System.out.println("Je suis un Bus et je vais à l'adresse "+adresse);

    }

    @Override
    public void vitesse(int speed) {

    }
}
