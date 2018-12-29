package com.carriel.souleyman.Model.Miam;

public class Aliment {
    private String name;
    private boolean estCuit;

    public  void manger(){
        if(estCuit){
            System.out.println("HMMMM,"+getName()+" est cuit, on peut le manger");
        }else{
            System.out.println("L'aliment : "+getName()+" n'est pas cuit, il faut patienter");
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isEstCuit() {
        return estCuit;
    }

    public void setIsCuit(boolean estCuit) {
        this.estCuit = estCuit;
    }
}
