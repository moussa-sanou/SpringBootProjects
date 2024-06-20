package com.sami.SpringBootLearning;

import org.springframework.stereotype.Service;

@Service
public class MyFirstService {

    private FirstClass firstClass;

    public String tellAStory()
    {
        return "the dependency is saying : " + firstClass.sayHello();
    }
}
