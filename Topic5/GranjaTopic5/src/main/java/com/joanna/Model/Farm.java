package com.joanna.Model;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

@Component("Farm")
public class Farm {

        public Farm(){


        }



    public String hola(){
            return "Farm Created";
    }
}
