package com.joanna.Controller;


import com.joanna.Model.Farmer;
import com.joanna.Model.HenHouse;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.Arrays;

@RestController
@RequestMapping("/")
public class FarmController {

    Farmer farmer = new Farmer();
    HenHouse henHouse = new HenHouse();

    @RequestMapping("/hello")
    //read the provided form data
    public ModelAndView display(){
        return new ModelAndView("farm");
    }

    @RequestMapping("/cartons")
    public String startFarm() {
        farmer.startFarming(henHouse.getHens()); // farmer farming all eggs of hen house.
        farmer.showEggsCartons();
        return Arrays.toString(farmer.getEggsCartons());
    }
}



