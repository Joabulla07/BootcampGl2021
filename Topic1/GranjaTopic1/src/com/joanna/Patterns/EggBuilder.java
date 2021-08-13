package com.joanna.Patterns;

import com.joanna.Items.Color;
import com.joanna.Objects.Egg;

public class EggBuilder implements EBuilder{
    private Color color;

    public EggBuilder color(Color color){
        this.color=color;
        return this;
    }


    @Override
    public Egg build() {
        Egg egg = new Egg();
        egg.setColor(this.color);
        return egg;
    }
}
