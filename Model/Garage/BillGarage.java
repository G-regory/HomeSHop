package com.carriel.souleyman.Model.Garage;

import com.carriel.souleyman.Model.HomeShop.Writer;

import java.util.HashMap;
import java.util.Map;

public class BillGarage {
    private Custumer custumer;
    private Vehicule vehicule;
    private Integer quantity;
    private Map<Vehicule, Integer> products = new HashMap<>();


    /**
     * ajout constructeur
     * @param custumer
     */
    public BillGarage(Custumer custumer) {
        this.custumer = custumer;
    }

    /**
     * Ajout véhicule et quantité
     * @param pVehicule
     * @param quantity
     */
    public void addProduct(Vehicule pVehicule,Integer quantity){
        products.put(pVehicule, quantity);
    }

    /**
     * calcul le total facture
     * @return
     */
    public double getTotal(Map<Vehicule, Integer> pProducts){
        double total=0.0;
        for(Map.Entry<Vehicule, Integer> product: pProducts.entrySet()){
            vehicule=product.getKey();
            quantity=product.getValue();
            total+=vehicule.getPrix()*quantity;
        }
        return total;
    }

    /**
     * va écrire la fazcture
     */
    public void generator(Writer2 writer){
        writer.start();
        writer.writeLine("Garage du coin");
        writer.writeLine("32 rue de paris, paris");
        writer.writeLine("");
        writer.writeLine("Facture de :");
        writer.writeLine(custumer.getFullName());
        writer.writeLine(custumer.getAdresse());
        writer.writeLine("");
        writer.writeLine("Voiture choisi: ");
        for (Map.Entry<Vehicule, Integer> entry: products.entrySet()) {
            Vehicule vehicule=entry.getKey();
            Integer quantity = entry.getValue();
            writer.writeLine(vehicule.getInfo());
            writer.writeLine("");
        }
        writer.writeLine("------------------------------------------------");
        writer.writeLine("Total : "+this.getTotal(products));
        writer.stop();
    }

    public Map<Vehicule, Integer> getProducts() {
        return products;
    }
}
