package com.joanna.Patterns;

import com.joanna.Items.Color;
import com.joanna.Objects.Hen;

public class FactoryHen implements Factory{

    @Override
    public Hen factoryHen(String color) {
        return switch (color) {
            case "white" -> new HenBuilder().color(Color.WHITE).build();
            case "red" -> new HenBuilder().color(Color.RED).build();
            default -> null;
        };
    }
}
