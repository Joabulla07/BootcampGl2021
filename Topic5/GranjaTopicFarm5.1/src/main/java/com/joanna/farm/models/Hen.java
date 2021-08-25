package com.joanna.farm.models;

import com.joanna.farm.models.BuilderPattern.EggBuilder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Component;


@NoArgsConstructor
@EqualsAndHashCode
@Getter
@Setter
@Component("Hen")
public class Hen {
    private Egg[] eggs;
    private String color;

    public Hen(String color){
        this.eggs= new Egg[2];
        this.color=color;
    }

	public String getEggsColor(){
        return this.color;
    }

    public Egg[] handEgg() {
        Egg[] handEggs = this.eggs; // Guardo el arreglo de los huevos de la gallina en una variable
        this.eggs = new Egg[2];
        return handEggs; // retorno la variable local con los huevos
    }

    public void layEggs(){
        Egg egg1 = new EggBuilder().color(this.color).build();
        Egg egg2 = new EggBuilder().color(this.color).build();
        this.eggs[0]= egg1;
        this.eggs[1]= egg2;
    }
    @Override
    public String toString() {
        return "egg colors: " + this.color;
    }

}
