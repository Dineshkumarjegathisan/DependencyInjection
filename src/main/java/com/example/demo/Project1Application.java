package com.example.demo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Project1Application {

	public static void main(String[] args) {
	ConfigurableApplicationContext context =SpringApplication.run(Project1Application.class, args);
	Home h1 = context.getBean(Home.class);
	h1.connect();//connecting to Internet
	Home h2 = context.getBean(Home.class);
	h2.connect();
	/*
	 h1(bean of spring) >> we get the output
	 		-->*** This is my constructor ***
	 		-->*** Connecting to Internet ***
	 h2 >>(bean of spring) we get the output 
	 		-->*** This is my constructor ***
	 		-->*** Connecting to Internet ***
	 		-->*** Connecting to Internet ***
	 		
	-> Because inside the string container create only one object
		-->Singleton Scope
		
	->if we want 2 objects we must give the @Scope(value = "prototype") in class
	 */
		
	}

}
