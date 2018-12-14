package com.carriel.souleyman.Model.Miam;

public class MicroOnde implements Cuisine {
    @Override
    public void faireCuire(String repas) {
        System.out.println("Je suis un micro onde et je rechauffe : "+repas);
    }
}
