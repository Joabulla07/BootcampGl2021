package com.joanna.Model.BuilderPattern;

import com.joanna.Enums.Color;
import com.joanna.Interfaces.EBuilder;
import com.joanna.Model.Egg;

public class EggBuilder implements EBuilder {
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
