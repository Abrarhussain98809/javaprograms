package com.carapp.user.util;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;
import org.springframework.stereotype.Component;

import com.carapp.user.model.UsersDTO;

@Component
public class CsvHelper {

	public static final String TYPE="text/csv";

    public static String[] headers = {"firstName","middleName","lastName","dateOfBirth","city","email","favouriteActor"};
    
   public List<UsersDTO> getUserDTOList(String fileName){
	   List<UsersDTO> usersDTOs=new ArrayList<>();
	   try(FileReader reader = new FileReader(fileName);
		BufferedReader bufferedReader =new BufferedReader(reader);
			   CSVParser parser = new CSVParser(bufferedReader, CSVFormat.DEFAULT.withFirstRecordAsHeader().withTrim());){
		   List<CSVRecord> records = parser.getRecords();
		   for (CSVRecord csvRecord:records) {
			   String firstName = csvRecord.get("firstName");
			   String middleName = csvRecord.get("middleName");
			   String lastName = csvRecord.get("lastName");
			   String dateOfBirth = csvRecord.get("dateOfBirth");
			   String city = csvRecord.get("city");
			   String email = csvRecord.get("email");
			   String favouriteActor=csvRecord.get("favouriteActor");
			   UsersDTO usersDTO=new UsersDTO(firstName, middleName, lastName, dateOfBirth, city, email, favouriteActor);
			   usersDTOs.add(usersDTO);
		   }
		   return usersDTOs;
	   }catch(Exception e) {
		   e.printStackTrace();
		   throw new RuntimeException();
	   }
   }
   public String getCSVFile(String fileName) {
	   return fileName;
   }
}
