package com.joanna.Model.FactoryPattern;

import com.joanna.Enums.Color;
import com.joanna.Interfaces.Factory;
import com.joanna.Model.Hen;
import com.joanna.Model.BuilderPattern.HenBuilder;


public class FactoryHen implements Factory {

    @Override
    public Hen factoryHen(Color color) {
        return switch (color) {
            case WHITE -> new HenBuilder().color(Color.WHITE).build();
            case RED -> new HenBuilder().color(Color.RED).build();
            default -> throw new IllegalArgumentException("Color not found");
        };
    }
}
