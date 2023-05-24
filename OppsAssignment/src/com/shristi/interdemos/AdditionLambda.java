package com.shristi.interdemos;
public class AdditionLambda {
	public static void main(String[] args) {
		Addition add=(a,b)->a+b;
		int number1=5;
		int number2=15;
		
		int result=add.performAddition(number1, number2);
		
		System.out.println("the addition of "+number1+" and "+number2+" is "+result);
	}

}
