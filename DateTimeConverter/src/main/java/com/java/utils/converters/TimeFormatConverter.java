package com.java.utils.converters;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.java.utils.Constants;

//Converting any time from source format to destination format
public class TimeFormatConverter {
	public static void main(String[] args) {
		String time = Constants.timeValue;
		String srcFormat = Constants.timeSourceFormat;
		String destFormat = Constants.timeDestinationFormat;

		TimeFormatConverter dateConverter = new TimeFormatConverter();
		try {

			String result = dateConverter.convertDateToGivenFormat(time, srcFormat, destFormat);
			System.out.println("Time : '" + time + "' in '" + destFormat + "' format is '" + result + "'");
		} catch (ParseException e) {

			System.out.println("Exception occured : " + e.getMessage());
			System.out.println(time + " : This is an invalid time");
		} catch (NullPointerException nullEx) {

			System.out.println("Please enter a non null time format");
		} catch (IllegalArgumentException illEx) {

			System.out.println("Please enter a valid time format");
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
