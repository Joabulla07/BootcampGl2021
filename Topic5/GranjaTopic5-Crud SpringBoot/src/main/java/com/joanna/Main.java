package com.joanna;

import com.joanna.Model.*;
import com.joanna.config.ApplicationContextConfig;
import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;





@SpringBootApplication
public class Main {
    private final static Logger log = Logger.getLogger(Main.class);
    public static void main(String[] args) {

        SpringApplication.run(Main.class, args);


        AnnotationConfigApplicationContext contexto=new AnnotationConfigApplicationContext(ApplicationContextConfig.class);

        //HenHouse henHouse = new HenHouse(); // Create a hen house (array of Hen).
        //Farmer farmer = new Farmer(); // Create a farmer.
        HenHouse henHouse = contexto.getBean("HenHouse", HenHouse.class);
        Farmer farmer = contexto.getBean("Farmer", Farmer.class);

        henHouse.initHenHouse();
        layEggs(henHouse.getHens()); // Hens lay eggs.
        farmer.startFarming(henHouse.getHens()); // farmer farming all eggs of hen house.
        farmer.showEggsCartons();

        contexto.close();
    }

    public static void layEggs(Hen[] hens) {

        for (Hen hen : hens) {
            hen.layEggs();
        }
    }


}

