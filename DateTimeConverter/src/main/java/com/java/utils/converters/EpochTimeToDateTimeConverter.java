package com.java.utils.converters;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.TimeZone;

import com.java.utils.Constants;

//Converts from epoch time in milliseconds to date-time format
public class EpochTimeToDateTimeConverter {
	public static void main(String[] args) {
		//Long dateTime = 1554076800000L;
		//String format = Constants.destinationFormatFromEpoch;
		String lastSuccessfulDate = "/Date(1554854400000)/";
		String lastSuccessfulDateconvert = null;
		lastSuccessfulDateconvert = lastSuccessfulDate.substring(lastSuccessfulDate.indexOf("(") + 1,
				lastSuccessfulDate.lastIndexOf(")"));
		Long dateConvertToLong = Long.parseLong(lastSuccessfulDateconvert);
		String destinationFormatFromEpoch = "yyyy-MM-ddHH:mm:ss";
		String result = convertToEpochTime(dateConvertToLong, destinationFormatFromEpoch);
		EpochTimeToDateTimeConverter converter =new EpochTimeToDateTimeConverter();
		
		String result2 = oDataDateToDate( lastSuccessfulDateconvert);
		System.out.println(result);
		System.out.println(result2);
	}

	public static String convertToEpochTime(Long timeDate, String format)
			throws NullPointerException, IllegalArgumentException {
		DateFormat dateFormat = new SimpleDateFormat(format);
		dateFormat.setTimeZone(TimeZone.getTimeZone(Constants.timeZone));
		String formatted = dateFormat.format(timeDate);
		
		return formatted;
	}
	private static String oDataDateToDate(String oDataformat)
			throws NullPointerException, IllegalArgumentException {
		    if(oDataformat ==null||oDataformat=="") {
		    	return null;
		    }
		String replacev= oDataformat.replace("/Date(", "").replace(")/","");
		//String replacevalue = new Date(parseInt(replace), 10))£»
        //String dt = new Date(parseInt(replacev.replace("/Date(", "").replace(")/", ""), 10));
		return replacev;
	}
}
