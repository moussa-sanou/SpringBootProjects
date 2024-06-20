package com.sami.SpringBootLearning;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApplicationConfig {


    @Bean("myBean")
    public FirstClass firstClass()
    {
        return new FirstClass("First bean");
    }
}
