package com.joanna.Objects;

import com.joanna.Items.Color;
import com.joanna.Patterns.FactoryHen;

public class HenHouse{
    private int henCount = 40;
    private int henRedCount = 28;
    private int henWhiteCount = 12;
    private Hen[] hens = new Hen[henCount];
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

            if (i < henWhiteCount) { // decide what color of eggs lays the hen.
                hens[i] = factoryHen.factoryHen(Color.WHITE);
            } else {
                hens[i] = factoryHen.factoryHen(Color.RED);
            }
        }
        return hens;
    }

    public Hen[] getHens() {
        return hens;
    }

    public int getHenCount() {
        return henCount;
    }

    public int getHenRedCount() {
        return henRedCount;
    }

    public int getHenWhiteCount() {
        return henWhiteCount;
    }
}
