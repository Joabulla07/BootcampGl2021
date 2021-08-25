package com.joanna.farm.models;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;
import org.springframework.stereotype.Component;

import java.util.Arrays;


@EqualsAndHashCode
@Getter
@Component("EggsCarton")
public class EggsCarton{
    @ToString.Exclude private Egg[][] eggs;
    @EqualsAndHashCode.Exclude  private int eggCount;
    @EqualsAndHashCode.Exclude private boolean full;
    private String color;
    @EqualsAndHashCode.Exclude private int[] freePlace = new int[2];
    
    
	public int getEggCount() {
		return eggCount;
	}

	public EggsCarton(String color){
        this.eggCount =0;
        this.full=false;
        this.color=color;
        this.eggs=new Egg[5][6];
        this.fillEmptyEggs();
    }

    public EggsCarton() {

    }

    public boolean isFull(){
        return this.full;
    }


    public String getColor() {
        return color;
    }
   
    public Egg[][] getEggs() {
		return eggs;
	}

	public void addEgg(Egg egg){
        if(egg.getColor().equals(this.color)){
            this.eggs[this.freePlace[0]][this.freePlace[1]]=egg;
            eggCount++;
            this.updateFreePlace();
            fullControl();
        }
    }


    public void updateFreePlace(){
        if(this.freePlace[0]<5){
            this.freePlace[0]++;
            if (this.freePlace[0]>4){
                this.freePlace[0]=0;
                this.freePlace[1]++;
            }
        }
    }

  
    public void fullControl(){
        if (this.eggCount ==30){
            this.full=true;
        }
    }


    public void fillEmptyEggs(){
        for (int i = 0; i <6 ; i++) {
            for (int j = 0; j <5 ; j++) {
                this.eggs[j][i]=new Egg();
            }
        }
    }

    @Override
    public String toString() {
        return "EggsCarton{" +
                "Cantidad=" + eggCount +
                ", color='" + color + '\'' +
                '}';
    }
}
