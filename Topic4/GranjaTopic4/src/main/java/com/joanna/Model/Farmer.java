package com.joanna.Model;

import com.joanna.constants.Color;
import com.joanna.services.FarmerService;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import org.springframework.stereotype.Component;

@Getter
@EqualsAndHashCode
@Component("Farmer")
public class Farmer implements FarmerService {
    private EggsCarton[] eggsCartons;

    public Farmer (){
        this.eggsCartons=new EggsCarton[3];
        this.initEggsCartons();
    }

    @Override
    public void startFarming(Hen[] hens){
        int cont=0;
        for (Hen hen: hens) {
            Egg[] eggs= hen.handEgg();
            for (Egg egg:eggs) {
                cont++;
                if (hen.getEggsColor().equals(Color.RED)) {
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

    @Override
    public void initEggsCartons(){
        this.eggsCartons[0]=new EggsCarton(Color.RED);
        this.eggsCartons[1]=new EggsCarton(Color.RED);
        this.eggsCartons[2]=new EggsCarton(Color.WHITE);
    }

    @Override
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
