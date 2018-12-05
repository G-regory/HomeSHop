package com.carriel.souleyman.Model.HomeShop;

import java.util.HashMap;
import java.util.Map;

public class Bill {
    private Custumer custumer;
   private Map<Product, Integer> products;

    public Bill(Custumer pCustumer){
        this.custumer=pCustumer;
        System.out.println("facture créé "+custumer.getFullname()+", "+custumer.getAdresse());
    }

    /**
     * add product et quantity to the bill
     * @param product produit ajouter
     * @param quantity  quiantite ajouter
     */
    public void addProduct(Product product, Integer quantity){
            this.products.put(product,quantity);
    }

    public Custumer getCustumer() {
        return custumer;
    }


    public Map<Product, Integer> getProducts() {
        return products;
    }

}
