package com.shristi.auto;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Component;
@Component
public class Indian implements IFoodMenu {

	@Override
	public List<String> showItems() {
		// TODO Auto-generated method stub
		return Arrays.asList("biryani","chapati");
	}

}
