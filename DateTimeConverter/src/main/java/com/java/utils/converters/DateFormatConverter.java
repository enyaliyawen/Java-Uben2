package com.java.utils.converters;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.java.utils.Constants;

//Converting any date from source format to destination format
public class DateFormatConverter {
	public static void main(String[] args) {
		String date = Constants.dateValue;
		String srcFormat = Constants.dateSourceFormat;
		String destFormat = Constants.dateDestinationFormat;

		DateFormatConverter dateConverter = new DateFormatConverter();
		try {

			String result = dateConverter.convertDateToGivenFormat(date, srcFormat, destFormat);
			System.out.println("Date : '" + date + "' in '" + destFormat + "' format is '" + result + "'");
		} catch (ParseException e) {

			System.out.println("Exception occured : " + e.getMessage());
			System.out.println(date + " : This is an invalid date");
		} catch (NullPointerException nullEx) {

			System.out.println("Please enter a non null date format");
		} catch (IllegalArgumentException illEx) {

			System.out.println("Please enter a valid date format");
		}
	}

	private String convertDateToGivenFormat(String value, String srcFormat, String destFormat)
			throws ParseException, NullPointerException, IllegalArgumentException {
		SimpleDateFormat dt = new SimpleDateFormat(srcFormat);
		Date date = dt.parse(value);
		DateFormat dateFormat = new SimpleDateFormat(destFormat);
		String formatted = dateFormat.format(date);

		return formatted;
	}
}
