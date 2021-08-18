package com.joanna.Objects;

import com.joanna.Items.Color;
import com.joanna.Patterns.EggBuilder;

import java.util.Arrays;

public class Hen {
    private Egg[] eggs;
    private Color color;

    public Hen(Color color){
        this.eggs= new Egg[2];
        this.color=color;
    }

    public Hen(){

    }

    public Color getEggsColor(){
        return this.color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public Egg[] getEgg() {
        return this.eggs;
    }

    public Egg[] handEgg() {
        Egg[] handEggs = this.eggs; // Guardo el arreglo de los huevos de la gallina en una variable
        this.eggs = new Egg[2];
        return handEggs; // retorno la variable local con los huevos
    }

    public void layEggs(){
        this.eggs[0]= new EggBuilder().color(this.color).build();
        this.eggs[1]= new EggBuilder().color(this.color).build();
    }



    @Override
    public String toString() {
        return "egg colors: " + this.color;
    }


}
