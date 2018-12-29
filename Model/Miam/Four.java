package com.carriel.souleyman.Model.Miam;

public class Four implements Cuisine{
    private int capacity;
    private int puissance;

    Soufflerie soufflerie;
    Resistance resistance;

    public void cuir(Aliment aliment, int temperature, int duree){
        aliment.setIsCuit(true);
        int min = 40, max = 250, nul = 0;
        if(temperature < min || temperature > max){
            throw new IllegalArgumentException("La température doit être comprise entre "+min+" et "+max);
        }
        if(duree <= nul){
            throw new IllegalArgumentException("La doit être supérieure à "+nul);
        }
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
