package com.carriel.souleyman.Model.HomeShop;

public class Television extends Product {
    private int tailleEcran;
    private String technologieDalle;

    public Television(String pName, String pDescription, double pPrix, int tailleEcran, String technologieDalle) {
        super(pName, pDescription, pPrix);
        this.tailleEcran= tailleEcran;
        this.technologieDalle= technologieDalle;
    }

    public int getTailleEcran() {
        return tailleEcran;
    }

    public void setTailleEcran(int tailleEcran) {
        this.tailleEcran = tailleEcran;
    }

    public String getTechnologieDalle() {
        return technologieDalle;
    }

    public void setTechnologieDalle(String technologieDalle) {
        this.technologieDalle = technologieDalle;
    }
}
