package com.joanna.Model;


import com.joanna.Interfaces.HFactory;
import com.joanna.Model.FactoryPattern.FactoryHen;
import com.joanna.constants.Color;
import com.joanna.services.HenHouseService;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;


@Getter
@Setter
@Component("HenHouse")
public class HenHouse implements HenHouseService {
    private int henCount = 40;
    private int henRedCount = 28;
    private int henWhiteCount = 12;
    private Hen[] hens = new Hen[40];


    @Autowired
    @Qualifier("FactoryHen")
    private HFactory factory;

    //FactoryHen factory = new FactoryHen();

    @Override
    public Hen[] initHenHouse() {
        for (int i = 0; i < 40; i++) {

            if (i < 12) { // decide what color of eggs lays the hen.
                hens[i] = factory.factoryHen(Color.WHITE);
            } else {
                hens[i] = factory.factoryHen(Color.RED);
            }
        }
        return hens;
    }
}
