package com.joanna.Model;


import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;
import org.springframework.stereotype.Component;

@EqualsAndHashCode
@ToString
@Getter
@Component("EggsCarton")
public class EggsCarton {
    @ToString.Exclude private Egg[][] eggs;
    @EqualsAndHashCode.Exclude @ToString.Exclude private int eggCount;
    @EqualsAndHashCode.Exclude private boolean full;
    private String color;
    @EqualsAndHashCode.Exclude @ToString.Exclude private int[] freePlace = new int[2];

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

}
