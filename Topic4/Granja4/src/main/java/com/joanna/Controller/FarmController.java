package com.joanna.Controller;


import com.joanna.Model.Farmer;
import com.joanna.Model.HenHouse;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
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
    public ModelAndView display(@RequestParam("name") String name,@RequestParam("pass") String pass,Model model){
        ModelAndView viewPage = new ModelAndView("viewpage");
        ModelAndView pageDeError = new ModelAndView("pageDeError");
        if(pass.equals("admin")) {

            model.addAttribute("message", name);
            return viewPage;
        }
        else
        {
            model.addAttribute("message", name);
            return pageDeError;
        }
    }

    @RequestMapping("/cartons")
    public String startFarm() {
        farmer.startFarming(henHouse.getHens()); // farmer farming all eggs of hen house.
        farmer.showEggsCartons();
        return Arrays.toString(farmer.getEggsCartons());
    }
}



