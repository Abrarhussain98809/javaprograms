package com.shristi.auto;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Component;
@Component
public class Continental implements IFoodMenu{

	@Override
	public List<String> showItems() {
		// TODO Auto-generated method stub
		return Arrays.asList("salad","pasta");
	}

}
