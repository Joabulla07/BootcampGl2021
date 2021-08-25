package com.joanna.Controller;


import com.joanna.Model.Farm;
import com.joanna.Model.Farmer;
import com.joanna.Model.HenHouse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class FarmController {

    @RequestMapping("/muestraFormulario")
    public String muestraFormulario(){ //proporciona el formulario
        return "HolaAlumnosFormulario";
    }

    @RequestMapping("/procesarFormulario")
    public String procesarFormulario(){
        return "HolaAlumnosSpring";
    }
}
