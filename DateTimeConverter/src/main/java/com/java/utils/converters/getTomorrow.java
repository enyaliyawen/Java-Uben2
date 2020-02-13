package com.java.utils.converters;

import java.time.Clock;
import java.time.LocalDateTime;
import java.util.Calendar;
import java.util.Date;

public class getTomorrow {
	public static void main(String[] args) {
		Date tomorrow = getTomorrow.getTomorrow(new Date());
		LocalDateTime D1=getTomorrow.getToday();
		Date d2 = new Date();
		System.out.println(tomorrow);
		System.out.println(D1);
		System.out.println(d2);
		
		
	}

	public static Date getTomorrow(Date toDate) {
		Calendar cal = Calendar.getInstance();
		cal.setTime(toDate);
		cal.add(Calendar.DATE, 1);
		return cal.getTime();
	}
	public static LocalDateTime getToday() {
		return LocalDateTime.now(Clock.systemUTC());
	}
	
}



