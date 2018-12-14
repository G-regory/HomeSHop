package com.carriel.souleyman.View;

import com.carriel.souleyman.Model.HomeShop.*;
import com.carriel.souleyman.Model.Miam.Client;
import com.carriel.souleyman.Model.Miam.Cuisine;
import com.carriel.souleyman.Model.Miam.Four;
import com.carriel.souleyman.Model.Miam.MicroOnde;
import com.carriel.souleyman.Model.Paris.*;

public class Main {
    public static void main(String[] args) {
        Television tv = new Television("Sony","Sony Bravia HD",50,1082,"LCD");
        Frigidaire fridge = new Frigidaire("Beko", "Fridge Géant", 120,100,true);
        Custumer client1 = new Custumer("Gregory Carriel","Paris 10 ème");
        Product template = new Product("Test","test détaillé", 30);
        Livraison livraison = new DirectDelivery();

        Bill facture1 = new Bill(client1, livraison);

        facture1.addProduct(tv,1);
        facture1.addProduct(fridge,1);
        facture1.addProduct(template,2);


    }
}
