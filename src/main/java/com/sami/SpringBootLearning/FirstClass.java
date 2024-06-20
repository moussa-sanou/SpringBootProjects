package com.sami.SpringBootLearning;

import org.springframework.stereotype.Component;


public class FirstClass {

    public FirstClass(String myVar) {
        this.myVar = myVar;
    }

    private String myVar;

    public String sayHello()
    {
        return "Hello from the first class ==> myVar = " + myVar;
    }

}
