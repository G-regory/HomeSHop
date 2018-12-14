package com.carriel.souleyman.Model.HomeShop;

public class ExpressDelivery implements Livraison {

   private String expressDelivery;

    @Override
    public double getPrice() {
        if(expressDelivery.equals("Paris")){
            return 6.99;
        }
        return 9.99;
    }

    public ExpressDelivery(String expressDelivery) {
        this.expressDelivery = expressDelivery;
    }
}
