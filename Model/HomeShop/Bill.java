package com.carriel.souleyman.Model.HomeShop;

import java.util.HashMap;
import java.util.Map;

public class Bill {
    private Custumer custumer;
    private Livraison livraison;
   private Map<Product, Integer> products= new HashMap<>();

    public Bill(Custumer custumer, Livraison livraison) {
        this.custumer = custumer;
        this.livraison = livraison;
    }

    public Bill(Custumer pCustumer){
        this.custumer=pCustumer;
    }

    /**
     * add product et quantity to the bill
     * @param pProduct produit ajouter
     * @param pQuantity  quiantite ajouter
     */
    public void addProduct(Product pProduct, Integer pQuantity){
            this.products.put(pProduct,pQuantity);
    }

    public Custumer getCustumer() {
        return custumer;
    }

    public Livraison getLivraison() {
        return livraison;
    }

    public Map<Product, Integer> getProducts() {
        return products;
    }

}
