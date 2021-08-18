package com.joanna.Patterns;

import com.joanna.Items.Color;
import com.joanna.Objects.Hen;


public class FactoryHen implements Factory{

    @Override
    public Hen factoryHen(Color color) {
        switch (color) {
            case WHITE: return new HenBuilder().color(Color.WHITE).build();
            case RED: return new HenBuilder().color(Color.RED).build();
            default: return null;
        }
    }
}
