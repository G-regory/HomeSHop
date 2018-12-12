package com.carriel.souleyman.Model.HomeShop;

public class Frigidaire extends Product {
    private int capacityLitre;
    private boolean isFreezer;

    public Frigidaire(String pName, String pDescription, double pPrix, int capacityLitre,boolean isFreezer) {
        super(pName, pDescription, pPrix);
        this.capacityLitre= capacityLitre;
        this.isFreezer= isFreezer;
    }

    public int getCapacityLitre() {
        return capacityLitre;
    }

    public void setCapacityLitre(int capacityLitre) {
        this.capacityLitre = capacityLitre;
    }

    public boolean isFreezer() {
        return isFreezer;
    }

    public void setFreezer(boolean freezer) {
        isFreezer = freezer;
    }
}
