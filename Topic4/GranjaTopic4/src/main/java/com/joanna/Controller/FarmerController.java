package com.joanna.Controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FarmerController {


    @GetMapping()
    public String holaMundo(){
        return "Hola mundo";
    }
}
