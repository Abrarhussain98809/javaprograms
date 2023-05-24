package com.shristi.interdemos;

import java.util.function.Consumer;

public class AdditionUsingConsumer {
	
	public static void performAddition(int number1,int number2,Consumer<Integer> addition) {
		int result=number1+number2;
		addition.accept(result);
	}
	public static void main(String[] args) {
		int number1=20;
		int number2=30;
		Consumer<Integer> addition=(result)->System.out.println("The addition result is "+ result);
		performAddition(20, 30, addition);

	}
	

}
