package com.carriel.souleyman.Model.HomeShop;

public class Product {
    private String name;
    private String description;
    private double prix;

    public Product(String pName, String pDescription, double pPrix){
        this.setName(pName);
        this.setDescription(pDescription);
        this.setPrix(pPrix);
//        System.out.println("produit créé "+name+", "+description+", "+prix);
    }

    /**
     * Voir déscription facture
     */
    public void look(){
    }

    /**
     * add product to bill
     * @param bille facure
     * @param quantity quantité ajouté
     */
    public void buy(Bill bille, Integer quantity){
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrix() {
        return prix;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }
}
