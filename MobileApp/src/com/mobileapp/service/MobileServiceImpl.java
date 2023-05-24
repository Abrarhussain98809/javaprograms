package com.mobileapp.service;

import com.mobileapp.model.Mobile;

public class MobileServiceImpl implements MobileService{

	@Override
	public Mobile getById(int id) throws MobileNotFoundException {
		Mobile[] mobiles=allMobiles();
		Mobile mobilebyid=new Mobile();
		int count=0;
		for(Mobile mobile:mobiles) {
			if(mobile.getMobileId()==id) {
				mobilebyid=mobile;
				count++;
			}}
			if(count==0) {
				throw new MobileNotFoundException();
			}
		return mobilebyid;
	}

	@Override
	public Mobile[] getAll() {
		Mobile[] mobiles=allMobiles();
		
		return mobiles;
	}

	@Override
	public Mobile[] getByBrand(String brand) throws MobileNotFoundException {
		
		Mobile[] mobiles=allMobiles();
		int count=0;
		Mobile[] mobilebybrand=new Mobile[count];
		for(Mobile mobile:mobiles) {
			if(mobile.getBrand().equals(brand))
			{
				count++;
			}
		}
		if(count==0) {
			throw new MobileNotFoundException();
		}
		int i=0;
		Mobile[] mobile1=new Mobile[count];
		for(Mobile mobile:mobiles) {
			if(mobile.getBrand().equals(brand)) {
				mobile1[i++]=mobile;
			}
		}
		return mobile1;
	}
	
	public Mobile[] allMobiles() {
		Mobile[] mobiles=new Mobile [5];
		mobiles[0]=new Mobile("A1",25000,"samsung",1);
		mobiles[1]=new Mobile("A2",35000,"oppo",2);
		mobiles[2]=new Mobile("A3",25000,"vivo",3);
		mobiles[3]=new Mobile("A4",46000,"samsung",4);
		mobiles[4]=new Mobile("A5",55000,"oneplus",5);
		return mobiles;
	}
	

}
