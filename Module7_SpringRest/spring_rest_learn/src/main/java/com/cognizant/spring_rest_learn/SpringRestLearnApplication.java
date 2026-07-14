package com.cognizant.spring_rest_learn;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cognizant.spring_rest_learn.bean.Country;

@SpringBootApplication
public class SpringRestLearnApplication {

	public static void main(String[] args) {

		SpringApplication.run(SpringRestLearnApplication.class, args);

		ApplicationContext context = new ClassPathXmlApplicationContext("country.xml");

		Country country = context.getBean("country", Country.class);

		System.out.println(country);
	}
}