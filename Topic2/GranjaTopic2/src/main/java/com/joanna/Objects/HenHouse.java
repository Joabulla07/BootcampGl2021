package com.joanna.Objects;

import com.joanna.Patterns.FactoryHen;

public class HenHouse{
    private Hen[] hens = new Hen[40];
    private static HenHouse instance;

    private HenHouse(){
        initHenHouse();
    }

    FactoryHen factoryHen = new FactoryHen();

    public static HenHouse getInstance(){
        if(instance == null){
           instance = new HenHouse();
        }
        return instance;
    }


    public Hen[] initHenHouse() {
        for (int i = 0; i < 40; i++) {

            if (i < 12) { // decide what color of eggs lays the hen.
                hens[i] = factoryHen.spawnhen("white");
            } else {
                hens[i] = factoryHen.spawnhen("red");
            }
        }
        return hens;
    }

    public Hen[] getHens() {
        return hens;
    }
}
