package com.sami.SpringBootLearning;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApplicationConfig {

    @Bean
    @Qualifier("bean1")
    public FirstClass firstClass()
    {
        return new FirstClass("First bean");
    }

    @Bean
    @Qualifier("bean2")
    public FirstClass SecondClass()
    {
        return new FirstClass("Second bean");
    }
}
