package com.carapp.user.repository;

public class Queries {

	static String INSERTQUERY="insert into myuser(userid,firstName,middleName,lastName,dateOfBirth,email,city,password,favouriteActor) values(?,?,?,?,?,?,?,?,?)" ;
	static String UPDATEQUERY="update myuser set password=? where email=?";
	static String DELETEQUERY="delete from myuser where userid=?";
	static String GETALLQUERY="select * from myuser";
	static String GETBYIDQUERY="select * from myuser where userid=?";
	static String GETBYEMAILANDPASSWORD="select * from myuser where email=? and password=?";
}
