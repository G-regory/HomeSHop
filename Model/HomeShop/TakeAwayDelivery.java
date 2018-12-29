package com.carriel.souleyman.Model.HomeShop;

public class TakeAwayDelivery implements Livraison {
    @Override
    public double getPrice() {
        return 0;
    }

    @Override
    public String getInfo() {
        return "retrait 0,00€";
    }
}
