package com.joanna.Model.BuilderPattern;


import com.joanna.constants.Color;
import com.joanna.Interfaces.BuilderH;
import com.joanna.Model.Hen;
import org.springframework.stereotype.Component;

@Component("HenBuilder")
public class HenBuilder implements BuilderH {
    private String color;

    public HenBuilder color(String color){
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
