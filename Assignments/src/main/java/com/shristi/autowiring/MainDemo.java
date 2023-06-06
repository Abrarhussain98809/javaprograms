package com.shristi.autowiring;

import java.util.Arrays;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainDemo {

	public static void main(String[] args) {
		ApplicationContext context=new AnnotationConfigApplicationContext("com.shristi.autowiring");

		Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
		Performer performer=context.getBean("performer",Performer.class);
		performer.playSong("v", "Jhoome jo pathaan");

	}

}
