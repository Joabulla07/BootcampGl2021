package com.joanna.Patterns;

import com.joanna.Items.Color;
import com.joanna.Objects.Hen;

public class HenBuilder implements HBuilder{
    private Color color;

    public HenBuilder color(Color color){
        this.color = color;
        return this;
    }

    @Override
    public Hen build() {
        Hen hen = new Hen(this.color);
        return hen;
    }
}
