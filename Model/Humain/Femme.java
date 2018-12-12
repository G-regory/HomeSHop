package com.carriel.souleyman.Model.Humain;

public class Femme extends Personne {
    public Femme(String pName, int pAge) {
        super(pName, pAge);
        System.out.println(pName+" a bien été créé");
    }



    @Override
    public void uriner() {
        System.out.println("Fait pipi assis");
    }
}
