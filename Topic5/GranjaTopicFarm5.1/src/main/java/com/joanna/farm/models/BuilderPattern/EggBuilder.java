package com.joanna.farm.models.BuilderPattern;


import com.joanna.farm.Interfaces.EBuilder;
import com.joanna.farm.models.Egg;
import org.springframework.stereotype.Component;


@Component("EggBuilder")
public class EggBuilder implements EBuilder {
    private String color;

    public EggBuilder color(String color){
        this.color=color;
        return this;
    }


    public Egg build() {
        Egg egg = new Egg();
        egg.setColor(this.color);
        return egg;
    }
}
