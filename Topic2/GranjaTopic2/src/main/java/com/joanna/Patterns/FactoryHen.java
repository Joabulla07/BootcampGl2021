package com.joanna.Patterns;

import com.joanna.Objects.Hen;

public class FactoryHen implements Factory{

    @Override
    public Hen spawnhen(String color) {
        switch (color){
            case "white":
                return new Hen(com.joanna.Items.Color.WHITE);
            case "red":
                return new Hen(com.joanna.Items.Color.RED);
            default:
                return null;

        }
    }
}
