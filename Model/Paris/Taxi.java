package com.carriel.souleyman.Model.Paris;

public class Taxi implements Transport {
    @Override
    public void seDeplace(String adresse) {
        System.out.println("Je suis un Taxi et je vais à l'adresse "+adresse);
    }

    @Override
    public void vitesse(int speed) {
        System.out.println("En taxi, je peux rouler assez vite, ma vitesse est :"+speed);
    }

}
