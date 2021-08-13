package com.joanna;

import com.joanna.Items.Color;
import com.joanna.Objects.EggsCarton;
import com.joanna.Objects.Farmer;
import com.joanna.Objects.Hen;
import com.joanna.Objects.HenHouse;

public class Main {

    public static void main(String[] args) {
        HenHouse henHouse = new HenHouse(); // Create a hen house (array of Hen).

        Farmer farmer = new Farmer(); // Create a farmer.

        layEggs(henHouse.getHens()); // Hens lay eggs.

        farmer.startFarming(henHouse.getHens()); // farmer farming all eggs of hen house.

        farmer.showEggsCartons();
    }



    public static void layEggs(Hen[] hens) {
        for (Hen hen : hens) {
            hen.layEggs();
        }
    }

}
