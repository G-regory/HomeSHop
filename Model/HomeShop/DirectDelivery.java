package com.carriel.souleyman.Model.HomeShop;

public class DirectDelivery implements Livraison {
    @Override
    public double getPrice() {
        return 4.99;
    }

    @Override
    public String getInfo() {
        return "Livraison à domicile "+getPrice();
    }


}
