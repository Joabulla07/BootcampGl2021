package com.joanna.Model.BuilderPattern;
import com.joanna.constants.Color;
import com.joanna.Interfaces.EBuilder;
import com.joanna.Model.Egg;
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
