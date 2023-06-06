package com.shristi.autowiring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Performer {
	@Autowired
	@Qualifier("violin")
	Instrument instrument;
	
	@Autowired
	Instrument guitar;
	
	@Autowired
	Instrument keyboard;
	
	void playSong(String type,String song)
	{
		if(type.equals("v")) {
			instrument.play("violin song"+song);
		}
		if(type.equals("g")) {
			guitar.play("guitar song"+song);
		}
		if(type.equals("k")) {
			keyboard.play("keyboard song"+song);
		}
	}

}
