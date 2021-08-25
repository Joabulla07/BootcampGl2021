package com.joanna.farm.controller;

import com.joanna.farm.models.EggsCarton;
import com.joanna.farm.models.Farmer;
import com.joanna.farm.models.Hen;
import com.joanna.farm.models.HenHouse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.lang.reflect.Array;
import java.util.Arrays;


@RestController
@RequestMapping("/home")
public class FarmController {

    @Autowired
    Farmer farmer;

    @Autowired
    HenHouse henHouse;

    @GetMapping("/cartons")
    public String cantidadEggs (){
        layEggs(henHouse.getHens()); // Hens lay eggs.
        farmer.startFarming(henHouse.getHens());
        //Arrays.toString(farmer.getEggsCartons())
        //farmer.showEggsCartons();
        return "EggsShow";
    }

    public static void layEggs(Hen[] hens) {

        for (Hen hen : hens) {
            hen.layEggs();
        }
    }

}
