package com.prowings.LocaleDate;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZonedDateTime;

public class DemoLocaledate {

	public static void main(String[] args) {
		
		LocalDateTime now = LocalDateTime.now();
		
		System.out.println("The current date & time: "+now);		
		
		
		LocalTime todaynow = LocalTime.now();
		
		System.out.println("the currentTiming is: "+todaynow);

		ZonedDateTime zdnow = ZonedDateTime.now();
		System.out.println("ZoneDateTime :"+zdnow);
		
		Instant inow =Instant.now();
		System.out.println("Instant.now: "+inow);
		
	
	}
	
	
}
