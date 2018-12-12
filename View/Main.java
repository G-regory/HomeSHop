package com.carriel.souleyman.View;

import com.carriel.souleyman.Model.HomeShop.*;

public class Main {
    public static void main(String[] args) {
        Television tv = new Television("Sony","Sony Bravia HD",50,1082,"LCD");
        Frigidaire fridge = new Frigidaire("Beko", "Fridge Géant", 120,100,true);
        Custumer client1 = new Custumer("Gregory Carriel","Paris 10 ème");
        Product template = new Product("Test","test détaillé", 30);

        Bill facture1 = new Bill(client1);
        
        facture1.addProduct(tv,1);
        facture1.addProduct(fridge,1);
        facture1.addProduct(template,2);

    }
}
