package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SumanSpringBootApplication {

	public static void main(String[] args) {
		ApplicationContext ctx=SpringApplication.run(SumanSpringBootApplication.class, args);
		person ob=ctx.getBean(person.class);
		ob.setName("Suman");
		ob.setAge(20);
		System.out.println(ob);
		passport ob1=ctx.getBean(passport.class);
		ob1.setNumber(1256);
		ob1.setValidyear("12/12/1233");
		System.out.println(ob1);
	}

}
