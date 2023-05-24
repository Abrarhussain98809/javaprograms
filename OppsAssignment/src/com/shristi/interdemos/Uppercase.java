package com.shristi.interdemos;

public class Uppercase {

	public static void main(String[] args) {
		StringConvertor convertor=(s)->s.toUpperCase();
		
		String name="hello abrar";
		
		String result=convertor.convertToUpercase(name);
		
		System.out.println("uppercase Srting "+result);

	}

}
