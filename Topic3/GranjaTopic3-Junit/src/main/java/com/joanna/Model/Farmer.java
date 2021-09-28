package com.joanna.Model;

import com.joanna.Enums.Color;
import lombok.EqualsAndHashCode;
import lombok.Getter;

@Getter
@EqualsAndHashCode
public class Farmer{
    private EggsCarton[] eggsCartons;
    private static Farmer instance;

    private Farmer (){
        this.eggsCartons=new EggsCarton[3];
        this.initEggsCartons();
    }

    public static Farmer getInstance(){
        if(instance == null){
            instance = new Farmer();
        }
        return instance;
    }


    public void startFarming(Hen[] hens){
        int cont=0;
        for (Hen hen: hens) {
            Egg[] eggs= hen.handEgg();
            for (Egg egg:eggs) {
                cont++;
                if (hen.getEggsColor() == Color.RED) {
                    if (!this.eggsCartons[0].isFull()) {
                        this.eggsCartons[0].addEgg(egg);

                    } else if (!this.eggsCartons[1].isFull()){
                        this.eggsCartons[1].addEgg(egg);
                    }
                } else if (!this.eggsCartons[0].isFull()){
                    this.eggsCartons[2].addEgg(egg);
                }
            }
        }
    }


    private void initEggsCartons(){
        this.eggsCartons[0]=new EggsCarton(Color.RED);
        this.eggsCartons[1]=new EggsCarton(Color.RED);
        this.eggsCartons[2]=new EggsCarton(Color.WHITE);
    }

    public void showEggsCartons() {
        for (EggsCarton eggsCartons : this.getEggsCartons()) {

            System.out.println("================\n"); // print a separator of eggs carton.
            for (int i = 0; i < 6; i++) {
                for (int j = 0; j < 5; j++) {
                    System.out.print(eggsCartons.getEggs()[j][i]); // print a egg.
                }
                System.out.println("\n");
            }

        }
    }
}
