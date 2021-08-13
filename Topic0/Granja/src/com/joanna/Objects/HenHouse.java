package com.joanna.Objects;

import com.joanna.Items.Color;

public class HenHouse {
    private Hen[] hens = new Hen[40];

    public HenHouse(){
        initHenHouse();
    }

    public Hen[] initHenHouse() {
        for (int i = 0; i < 40; i++) {

            if (i < 12) { // decide what color of eggs lays the hen.
                hens[i] = new Hen(Color.WHITE);
            } else {
                hens[i] = new Hen(Color.RED);
            }
        }
        return hens;
    }

    public Hen[] getHens() {
        return hens;
    }
}
