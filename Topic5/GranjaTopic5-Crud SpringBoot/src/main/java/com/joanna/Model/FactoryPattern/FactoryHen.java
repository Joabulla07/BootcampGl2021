package com.joanna.Model.FactoryPattern;

import com.joanna.constants.Color;
import com.joanna.Interfaces.HFactory;
import com.joanna.Model.BuilderPattern.HenBuilder;
import com.joanna.Model.Hen;
import lombok.Getter;
import org.springframework.stereotype.Component;

@Getter
@Component("FactoryHen")
public class FactoryHen implements HFactory {

    @Override
    public Hen factoryHen(String color) {
        return switch (color) {
            case "WHITE" -> new HenBuilder().color(Color.WHITE).build();
            case "RED" -> new HenBuilder().color(Color.RED).build();
            default -> throw new IllegalStateException("Unexpected value: " + color);
        };
    }

}
