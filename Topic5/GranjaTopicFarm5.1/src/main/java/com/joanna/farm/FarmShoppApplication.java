package com.joanna.farm;

import com.joanna.farm.config.AppConfig;
import com.joanna.farm.models.Farmer;
import com.joanna.farm.models.Hen;
import com.joanna.farm.models.HenHouse;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;

@SpringBootApplication
public class FarmShoppApplication {

    public static void main(String[] args) {
        SpringApplication.run(FarmShoppApplication.class, args);
        AnnotationConfigApplicationContext contexto = new AnnotationConfigApplicationContext(AppConfig.class);

        //Farmer farmer = contexto.getBean("Farmer", Farmer.class);
        //HenHouse henHouse = contexto.getBean("HenHouse", HenHouse.class);

        //layEggs(henHouse.getHens()); // Hens lay eggs.
        //farmer.startFarming(henHouse.getHens());
        //farmer.showEggsCartons();

        //System.out.println(Arrays.toString(farmer.getEggsCartons()));

    }



}
