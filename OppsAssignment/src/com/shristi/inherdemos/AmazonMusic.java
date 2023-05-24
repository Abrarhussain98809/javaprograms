package com.shristi.inherdemos;

public class AmazonMusic {

	void showTypes()
	{
		System.out.println("podcasts");
		System.out.println("music");
		System.out.println("melodies");
	}
	void showSubdetails(String type)
	{
		if(type.equals("music"))
		{
			System.out.println("get all music melodies..");
		}
		else
		{
			System.out.println("get podcast free..");
		}
	}
}
