package com.joanna.Objects;

import com.joanna.Items.Color;
import com.joanna.Patterns.EggBuilder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@NoArgsConstructor
@EqualsAndHashCode
@Getter
@Setter
public class Hen {
    private Egg[] eggs;
    private Color color;

    public Hen(Color color){
        this.eggs= new Egg[2];
        this.color=color;
    }

    public Color getEggsColor(){
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
