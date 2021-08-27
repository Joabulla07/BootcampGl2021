package com.joanna.config;


import com.joanna.service.EmpServiceImp;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.joanna*")
public class AppConfig {

    @Bean
    EmpServiceImp dao(){
        return new EmpServiceImp();
    }

}
