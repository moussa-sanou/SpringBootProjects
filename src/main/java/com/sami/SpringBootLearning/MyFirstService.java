package com.sami.SpringBootLearning;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MyFirstService {
    private FirstClass firstClass;
    @Autowired
    public MyFirstService(FirstClass firstClass) {
        this.firstClass = firstClass;
    }

    public String tellAStory()
    {
        return "the dependency is saying : " + firstClass.sayHello();
    }
}
