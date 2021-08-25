package com.joanna.farm.models.BuilderPattern;


import com.joanna.farm.Interfaces.BuilderH;
import com.joanna.farm.models.Hen;
import org.springframework.stereotype.Component;

@Component("HenBuilder")
public class HenBuilder implements BuilderH {
    private String color;

    public HenBuilder color(String color){
        this.color = color;
        return this;
    }

    public Hen build() {
        Hen hen = new Hen(this.color);
        hen.setColor(this.color);
        return hen;
    }
}
