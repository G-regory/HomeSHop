package com.carriel.souleyman.Model.Humain;

public abstract class EtreHumain {

    private String name;
    private int age;

    public EtreHumain(String pName, int pAge){
        name=pName;
        age=pAge;
    }

    public abstract void  uriner();
}
