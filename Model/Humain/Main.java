package com.carriel.souleyman.Model.Humain;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Personne> personne = new ArrayList<>();
        personne.add(new Homme("Benoit",30));
        personne.add(new Femme("Sarah", 25));
        personne.add(new Bebe("Mike", 2));

        Bebe baby = new Bebe("Assiya", 7);
        baby.seDeplace();
        baby.uriner();

        Personne baby2 = new Bebe("Salma", 2);
        baby2.seDeplace();
        baby2.uriner();

        for(Personne b :personne ){
            b.uriner();
            b.seDeplace();
        }

        Personne benoit = new Personne("Benoit", 30);
        benoit.seDeplace();


    }
}
