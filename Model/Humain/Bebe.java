package com.carriel.souleyman.Model.Humain;

public class Bebe extends Personne {

    public Bebe(String pName, int pAge) {
        super(pName, pAge);
        System.out.println(pName+" a bien été créé");
    }

    public void seDeplace(){
        System.out.println("ne marche pas encore, se déplace en rampant");
    }

    public void jouer(){
        System.out.println("fait du bruit avec son hochet");
    }

    @Override
    public void uriner() {
        System.out.println("Fait pipi dans sa couche");
    }
}
