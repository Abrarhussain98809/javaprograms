package com.mobileapp.client;

import com.mobileapp.model.Mobile;
import com.mobileapp.service.MobileNotFoundException;
import com.mobileapp.service.MobileService;
import com.mobileapp.service.MobileServiceImpl;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MobileService mob=new MobileServiceImpl();
		Mobile[] mobiles=mob.getAll();
		for(Mobile mobile:mobiles)
		{
			System.out.println(mobile);
		}
		System.out.println("by id...");
		try {
			
			System.out.println(mob.getById(2));
		}
		catch(MobileNotFoundException e){
			e.printStackTrace();
		}
		System.out.println("by brand......");
		Mobile[] mobilesbybrand;
		try {
			mobilesbybrand=mob.getByBrand("oneplus");
			for(Mobile mobile:mobilesbybrand) {
				System.out.println(mobile);
			}
		
		}catch(MobileNotFoundException e)
		{
			e.printStackTrace();
		}
	
	}
}
