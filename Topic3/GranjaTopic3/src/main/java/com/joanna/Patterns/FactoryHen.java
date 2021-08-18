package com.joanna.Patterns;

import com.joanna.Items.Color;
import com.joanna.Objects.Hen;


public class FactoryHen implements Factory{

    @Override
    public Hen factoryHen(Color color) {
        return switch (color) {
            case WHITE -> new HenBuilder().color(Color.WHITE).build();
            case RED -> new HenBuilder().color(Color.RED).build();
            default -> throw new IllegalArgumentException("Color not found");
        };
    }
}
