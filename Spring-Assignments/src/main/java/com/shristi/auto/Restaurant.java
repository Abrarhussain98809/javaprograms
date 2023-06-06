package com.shristi.auto;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Restaurant {
	@Autowired
	@Qualifier("chinese")
	IFoodMenu chinese;
	
	@Autowired
	IFoodMenu indian;
	
	@Autowired
	IFoodMenu continental;
	
	public List<String> displayMenu(String choice){
		List<String> items=null;
		if(choice.equals("chinese")) {
			items=chinese.showItems();
		}
		if(choice.equals("indian")) {
			items=indian.showItems();
		}
		if(choice.equals("continental")) {
			items=continental.showItems();
		}
		return items;
	}
}
