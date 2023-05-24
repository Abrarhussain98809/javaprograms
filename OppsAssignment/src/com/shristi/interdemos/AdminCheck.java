package com.shristi.interdemos;

import java.util.function.BiConsumer;

public class AdminCheck {

	public static void main(String[] args) {
		String name="Admin";
		int age=35;
		
		BiConsumer<String,Integer> adminCheck=(n,a)->{
			if(n.equals("Admin")&&a>30) {
				System.out.println("Welcome Admin..");
			}
			else {
				System.out.println("Wrong user.");
			}
		};
		adminCheck.accept(name, age);
	}

}
