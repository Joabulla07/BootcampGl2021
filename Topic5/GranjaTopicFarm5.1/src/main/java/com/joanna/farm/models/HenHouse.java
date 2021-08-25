package com.joanna.farm.models;


import com.joanna.farm.constants.Color;
import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;


@Getter
@Setter
@Component("HenHouse")
public class HenHouse{
    @SuppressWarnings("unused")
	private int henCount = 40;
    @SuppressWarnings("unused")
    private int henRedCount = 28;
    @SuppressWarnings("unused")
    private int henWhiteCount = 12;
    private Hen[] hens = new Hen[40];

    FactoryHen factory = new FactoryHen();

    public Hen[] getHens() {
		return hens;
	}

	public void setHens(Hen[] hens) {
		this.hens = hens;
	}


    public HenHouse(){
        initHenHouse();
    }


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
