package com.java.utils.converters;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

import com.java.utils.Constants;

//Converts date-time format to epoch time in milliseconds
public class DateTimeToEpochTimeConverter {
	public static void main(String[] args) {
		String date = Constants.dateTimeValue;
		String format = Constants.sourceFormatForEpoch;

		DateTimeToEpochTimeConverter dateConverter = new DateTimeToEpochTimeConverter();
		try {

			Long result = dateConverter.convertToEpochTime(date, format);
			System.out.println("Data-Time : '" + date + "' in Epoch time is '" + result + "'");
		} catch (ParseException e) {

			System.out.println("Exception occured : " + e.getMessage());
			System.out.println(date + " : This is an invalid date-time");
		} catch (NullPointerException nullEx) {

			System.out.println("Please enter a non null date-time format");
		} catch (IllegalArgumentException illEx) {

			System.out.println("Please enter a valid date-time format");
		}
	}

	public Long convertToEpochTime(String timeDate, String format)
			throws ParseException, NullPointerException, IllegalArgumentException {
		Long epochTime = 0L;

		DateFormat dateFormat = new SimpleDateFormat(format);
		dateFormat.setTimeZone(TimeZone.getTimeZone(Constants.timeZone));
		Date date = dateFormat.parse(timeDate);
		epochTime = date.getTime();

		return epochTime;
	}
}
