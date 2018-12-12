package com.carriel.souleyman.Model.Humain;

public class Personne extends EtreHumain {


    public Personne(String pName, int pAge) {
        super(pName, pAge);
    }

    public void seDeplace(){
        System.out.println("En marchant, met un pied après l'autre");
    }

    @Override
    public void uriner() {

    }
}
