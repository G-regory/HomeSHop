package com.carriel.souleyman.View;

import com.carriel.souleyman.Model.Animals.Animal;
import com.carriel.souleyman.Model.Animals.Dog;
import com.carriel.souleyman.Model.Garage.BillGarage;
import com.carriel.souleyman.Model.Garage.Car;
import com.carriel.souleyman.Model.HomeShop.*;
import com.carriel.souleyman.Model.Garage.FileWrite2;

import java.util.*;

public class Main {
    public static void main(String[] args) {
//        Television tv = new Television("Sony","Sony Bravia HD",599,1082,"LCD");
//        Frigidaire fridge = new Frigidaire("Beko", "Fridge Géant", 189,100,true);
       Product cafe = new Product("Philips SENSEO","machine a café", 79.99);
        Custumer client1 = new Custumer("Gregory Carriel","Paris 10 ème");
        Livraison livraison = new DirectDelivery();
        Bill facture1 = new Bill(client1, livraison);

//        try {
//            facture1.generate(new FileWriter("facture2 leblanc"));
//        }catch (NullPointerException e){
//            System.out.println("Pas de produit selectionné");
//        }

        Animal dog = new Animal() {
            @Override
            public void taf() {

            }
        };
       dog.taf();
        List<List<String>> sentences = new ArrayList<List<String>>();



        if(dog instanceof Animal){
            System.out.println("c'est vrai");
        }else{
            System.out.println("je ne pense pas");
        }




//        facture1.addProduct(tv,1);
//        facture1.addProduct(fridge,1);
//        facture1.addProduct(cafe,2);
//



//        Car mercedes = new Car("Mercedes", 2018, "Black", 220, 3000, 20000, 5, 6, "16v" );
//        Custumer custumer = new Custumer("gregory Carriel", "39 rue de paris, paris");
//        BillGarage facture = new BillGarage(custumer);
////        facture.addProduct(mercedes,3);
//        facture.generator(new FileWrite2("fact"));



    }
}
