package com.java.utils.validation;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.java.utils.Constants;

//This checks if the entered date is correct or not
public class DateValidator {
	public static void main(String[] args) {

		// Change the values in Constants file
		String date = Constants.date;
		String dateFormat = Constants.dateFormat;

		try {
			if (date != null) {
				SimpleDateFormat sdf = new SimpleDateFormat(dateFormat);
				sdf.setLenient(false);
				Date date1 = sdf.parse(date);
				sdf.format(date1);
				System.out.println(date + " : This is a valid date");
			} else {
				System.out.println("Please enter a non null date");
			}
			
		} catch (NullPointerException nullEx) {
			System.out.println("Please enter a non null date format");
		} catch (IllegalArgumentException illEx) {
			System.out.println("Please enter a valid date format");
		} catch (ParseException ex) {
			System.out.println("Exception occured : " + ex.getMessage());
			System.out.println(date + " : This is an invalid date");
		}
	}
}