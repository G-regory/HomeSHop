package com.carriel.souleyman.Model.Miam;

import com.carriel.souleyman.Model.Miam.Aliment;

public class Four implements Cuisine{
    private int capacity;
    private int puissance;

    Soufflerie soufflerie;
    Resistance resistance;

    public void cuir(Aliment aliment){
        aliment.setEstCuit(true);
        System.out.println("La capacité du four est : "+capacity+" litres");
        System.out.println("La puissance est de : "+puissance+" degré");
        System.out.println("je suis cuit cet aliment: "+aliment.getName());

    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getPuissance() {
        return puissance;
    }

    public void setPuissance(int puissance) {
        this.puissance = puissance;
    }

    @Override
    public void faireCuire(String repas) {
        System.out.println("Je vais mettre mon "+repas+ " au four");
    }

}
