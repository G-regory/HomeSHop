package com.carriel.souleyman.Model.HomeShop;

public class RelayDelivery implements Livraison {
    private int relayDelivery;

    @Override
    public double getPrice() {
        if(relayDelivery < 23 && relayDelivery > 0) {
            return 0;
        }else if(relayDelivery >= 23 && relayDelivery < 48){
            return 2.99;
        }
        return 4.99;
    }

    @Override
    public String getInfo() {
        return "Livraison point relai "+getPrice();
    }

    public RelayDelivery(int relayDelivery) {
        this.relayDelivery = relayDelivery;
    }
}
