package com.sami.SpringBootLearning;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringBootLearningApplication {

	public static void main(String[] args) {
		var ctx = SpringApplication.run(SpringBootLearningApplication.class, args);

		FirstClass firstClass = ctx.getBean("myBean",FirstClass.class);
		String ans = firstClass.sayHello();
		System.out.println(ans);
	}


}
