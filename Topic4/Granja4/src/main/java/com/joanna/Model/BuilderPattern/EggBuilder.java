package com.joanna.Model.BuilderPattern;

import com.joanna.Model.Egg;
import com.joanna.interfacess.EBuilder;
import org.springframework.stereotype.Component;


@Component("EggBuilder")
public class EggBuilder implements EBuilder {
    private String color;

    public EggBuilder color(String color){
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
