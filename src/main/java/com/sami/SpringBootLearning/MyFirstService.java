package com.sami.SpringBootLearning;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class MyFirstService {
    private final FirstClass firstClass;

    public MyFirstService(@Qualifier("bean2") FirstClass firstClass) {
        this.firstClass = firstClass;
    }

    public String tellAStory()
    {
        return "the dependency is saying : " + firstClass.sayHello();
    }
}
