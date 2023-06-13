package com.carapp.repository;

public class Queries {

	static String INSERTQUERY="insert into car(carId,brand,model,year,color,mileage,price,bodyType,fuelType,transmission,kmsRun) values(?,?,?,?,?,?,?,?,?,?,?)";
	static String UPDATEQUERY="update car set price=? where carId=?";
	static String DELETEQUERY="delete from car where carId=?";
	static String FINDALL="select * from car";
	static String FINDBYID="select * from car where carId=?";
	static String FINDBYBRAND="select * from car where brand=?";
	static String FINDBYPRICELESSTHAN="select * from car where price < ?";
	static String FINDBYCOLOR="select * from car where color=?";
	static String FINDBYFUELTYPE="select * from car where fuelType=?";
	static String FINDBYYEAR="select * from car where year=?";
	static String FINDBYBRANDANDMODEL="select * from car where brand=? and model=?";
}
