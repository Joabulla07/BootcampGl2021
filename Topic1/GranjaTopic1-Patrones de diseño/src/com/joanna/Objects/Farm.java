package com.joanna.Objects;

public class Farm {
        private  static Farm instance;
        private Farm(){
            HenHouse henHouse = HenHouse.getInstance(); // Create a hen house (array of Hen).

            Farmer farmer = Farmer.getInstance(); // Create a farmer.

            layEggs(henHouse.getHens()); // Hens lay eggs.

            farmer.startFarming(henHouse.getHens()); // farmer farming all eggs of hen house.

            farmer.showEggsCartons();

        }

        public static Farm getInstance(){
            if(instance == null){
                instance = new Farm();
            }
            return instance;
        }


    public static void layEggs(Hen[] hens) {

        for (Hen hen : hens) {
            hen.layEggs();
        }
    }
}
