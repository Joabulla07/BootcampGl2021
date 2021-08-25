package com.joanna.farm.config;



import com.joanna.farm.models.Farm;
import com.joanna.farm.models.HenHouse;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@ComponentScan("com.joanna.*")
public class AppConfig {

    @Bean
    Farm farm(){
        return new Farm();
    }

    @Bean
    HenHouse henHouse(){
        return new HenHouse();
    }

    @Bean(name = "viewResolver")
    public InternalResourceViewResolver getViewResolver() {
        InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
        viewResolver.setPrefix("/resource/templates/");
        viewResolver.setSuffix(".jsp");
        return viewResolver;
    }
}
