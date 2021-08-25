package com.joanna.Controller;


import com.joanna.Model.Egg;
import com.joanna.Model.EggsCarton;

import com.joanna.Model.Farmer;
import com.joanna.Model.HenHouse;
import com.joanna.database.DataFarm;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;
import java.util.logging.Logger;

@RestController
@RequestMapping("/")
public class FarmController {

    Farmer farmer = new Farmer();
    HenHouse henHouse = new HenHouse();

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String hello() {
        return "index";

    }


    @GetMapping("/cartons")
    public String startFarm() {
        farmer.startFarming(henHouse.getHens()); // farmer farming all eggs of hen house.
        farmer.showEggsCartons();
        return Arrays.toString(farmer.getEggsCartons());
    }


}

