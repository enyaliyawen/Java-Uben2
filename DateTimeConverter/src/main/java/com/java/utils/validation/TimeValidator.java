package com.java.utils.validation;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.java.utils.Constants;

//This checks if the entered time is correct or not
public class TimeValidator {
	public static void main(String[] args) {

		// Change the values in Constants file
		String time = Constants.time;
		String timeFormat = Constants.timeFormat;

		try {
			if (time != null) {
				SimpleDateFormat sdf = new SimpleDateFormat(timeFormat);
				sdf.setLenient(false);
				Date date = sdf.parse(time);
				sdf.format(date);
				System.out.println(time + " : This is a valid time");
			} else {
				System.out.println("Please enter a non null time");
			}
		} catch (NullPointerException nullEx) {
			System.out.println("Please enter a non null time format");
		} catch (IllegalArgumentException illEx) {
			System.out.println("Please enter a valid time format");
		} catch (ParseException ex) {
			System.out.println("Exception occured : " + ex.getMessage());
			System.out.println(time + " : This is an invalid time");
		}
	}
}