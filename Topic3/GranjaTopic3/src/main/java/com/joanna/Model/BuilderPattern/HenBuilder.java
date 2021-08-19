package com.joanna.Model.BuilderPattern;

import com.joanna.Enums.Color;
import com.joanna.Interfaces.HBuilder;
import com.joanna.Model.Hen;

public class HenBuilder implements HBuilder {
    private Color color;

    public HenBuilder color(Color color){
        this.color = color;
        return this;
    }

    @Override
    public Hen build() {
        Hen hen = new Hen(this.color);
        hen.setColor(this.color);
        return hen;
    }
}
