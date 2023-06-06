package com.shristi.auto;

import java.util.Arrays;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainApp {

	public static void main(String[] args){
		
		ApplicationContext context=new AnnotationConfigApplicationContext("com.shristi.auto");
		Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
		Restaurant restaurant=context.getBean("restaurant",Restaurant.class);
		String choice="chinese";
		List<String> chineseMenu = restaurant.displayMenu(choice);
		System.out.println(chineseMenu);
//		restaurant.displayMenu("chinese");
	}

}
