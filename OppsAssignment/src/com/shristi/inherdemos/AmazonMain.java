package com.shristi.inherdemos;

public class AmazonMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AmazonPrime amazonprime=new AmazonPrime("prime", 5000);
		amazonprime.showCategories();
		amazonprime.showDetails("prime");
		System.out.println("............\n");
		AmazonMusic amazonmusic=new AmazonMusic();
		amazonmusic.showTypes();
		amazonmusic.showSubdetails("music");
		
	}

}
