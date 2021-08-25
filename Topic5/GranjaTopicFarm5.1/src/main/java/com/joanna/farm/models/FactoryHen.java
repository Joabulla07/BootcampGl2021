package com.joanna.farm.models;

import com.joanna.farm.models.BuilderPattern.HenBuilder;
import com.joanna.farm.constants.Color;

import lombok.Getter;
import org.springframework.stereotype.Component;

@Getter
@Component("FactoryHen")
public class FactoryHen{

   
    public Hen factoryHen(String color) {
         switch (color) {
            case "WHITE" : return new HenBuilder().color(Color.WHITE).build(); 
            case "RED" : return new HenBuilder().color(Color.RED).build();
            default :  throw new IllegalStateException("Unexpected value: " + color);
        }
    }

}
