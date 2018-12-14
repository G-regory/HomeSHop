package com.carriel.souleyman.Model.Paris;

public class Metro implements Transport {
    @Override
    public void seDeplace(String adresse) {
        System.out.println("Je suis un Métro et je vais à l'adresse "+adresse);
    }

    @Override
    public void vitesse(int speed) {

    }

}
