package com.shristi.interdemos;

public class CalculatorMain {

	public static void main(String[] args) {
		
		Calculator add=(x,y)->System.out.println("addition is :"+(x+y));
		Calculator sub=(x,y)->System.out.println("subtraction is :"+(x-y));
		Calculator mul=(x,y)->System.out.println("multiplication is :"+(x*y));
		
		Calculator div=(x,y)->{
			if(y!=0) {
				System.out.println("division is :"+((double)x/y));
			}else {
				System.out.println("error div by zero");
			}
		};
		add.calulate(4,6);
		sub.calulate(17,2);
		mul.calulate(7,6);
		div.calulate(4,0);
		
		
	}

}
