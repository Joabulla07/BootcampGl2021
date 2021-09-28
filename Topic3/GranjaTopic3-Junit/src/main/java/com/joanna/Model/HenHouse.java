package com.joanna.Model;

import com.joanna.Enums.Color;
import com.joanna.Model.FactoryPattern.FactoryHen;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class HenHouse{
    private int henCount = 40;
    private int henRedCount = 28;
    private int henWhiteCount = 12;
    private Hen[] hens = new Hen[40];
    private static HenHouse instance;
    FactoryHen factoryHen = new FactoryHen();

    private HenHouse(){
        initHenHouse();
    }

    public static HenHouse getInstance(){
        if(instance == null){
           instance = new HenHouse();
        }
        return instance;
    }

    public Hen[] initHenHouse() {
        for (int i = 0; i < 40; i++) {

            if (i < 12) { // decide what color of eggs lays the hen.
                hens[i] = factoryHen.factoryHen(Color.WHITE);
            } else {
                hens[i] = factoryHen.factoryHen(Color.RED);
            }
        }
        return hens;
    }
}
