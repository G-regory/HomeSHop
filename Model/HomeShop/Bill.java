package com.carriel.souleyman.Model.HomeShop;

import java.util.HashMap;
import java.util.Map;

public class Bill {
    private Custumer custumer;
    private Livraison livraison;
    private Map<Product, Integer> products = new HashMap<>();

    public Bill(Custumer custumer, Livraison livraison) {
        this.custumer = custumer;
        this.livraison = livraison;
    }

    public Bill(Custumer pCustumer) {
        this.custumer = pCustumer;
    }

    /**
     * add product et quantity to the bill
     *
     * @param pProduct  produit ajouter
     * @param pQuantity quiantite ajouter
     */
    public void addProduct(Product pProduct, Integer pQuantity) {
        this.products.put(pProduct, pQuantity);
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

    public void generate(Writer writer) {
        if(products.isEmpty()) {
            throw new NoProductToBill();
        }
        writer.start();
        writer.writeLine("HomeShop compagnie");
        writer.writeLine("1 place Charle de Gaulle, 75008 Paris");
        writer.writeLine("");
        writer.writeLine("Facure à l'attention de :");
        writer.writeLine(custumer.getFullname());
        writer.writeLine(custumer.getAdresse());
        writer.writeLine("");
        writer.writeLine("Mode de livraison : "+livraison.getInfo());
        writer.writeLine("");
        writer.writeLine("Produits :");
        writer.writeLine("------------------------------------------------");
        for (Map.Entry<Product, Integer> entry :products.entrySet()) {
            Product product = entry.getKey();
            Integer quantity = entry.getValue();
            writer.writeLine(product.getName()+" - "+ product.getPrix()+" - "+ quantity+" unité(s)" );
            writer.writeLine(product.getDescription());
            writer.writeLine("");
        }
        writer.writeLine("Livraison : "+livraison.getPrice());
        writer.writeLine("------------------------------------------------");
        writer.writeLine("Total : "+this.getTotal());
        writer.stop();
    }

    public double getTotal() {
        double total = 0.0;
        for (Map.Entry<Product, Integer> donner : products.entrySet()) {
            Product product = donner.getKey();
            Integer quantity = donner.getValue();
            total += product.getPrix() * quantity;
        }
        total += livraison.getPrice();
        return total;
    }

}
