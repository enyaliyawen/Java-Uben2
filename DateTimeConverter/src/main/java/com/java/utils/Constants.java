package com.java.utils;

public interface Constants {

	/* Used in ValidateDate class */
	String date = "2017-01-01"; // Value corresponding to the format
	String dateFormat = "yyyy-MM-dd"; // Can be any date format eg: yyyyMMdd.

	/* Used in ValidateTime class */
	String time = "12:00:00";// Value corresponding to the format
	String timeFormat = "HH:mm:ss"; // Can be any time format eg: mm:HH:ss.

	/* Used in ConverterFromAnyDateFormatToAnyOtherDateFormat class */
	String dateValue = "2017-01-01"; // Value corresponding to the format
	// Can be any date format eg: yyyyMMdd.
	String dateSourceFormat = "yyyy-MM-dd";
	// Can be any date format eg: yyyy-MM-dd.
	String dateDestinationFormat = "yyyyMMdd";

	/* Used in ConverterFromAnyTimeFormatToAnyOtherTimeFormat class */
	String timeValue = "12:00:00";// Value corresponding to the format
	// Can be any time format eg: mm:HH:ss.
	String timeSourceFormat = "HH:mm:ss";
	String timeDestinationFormat = "HHmmss";
	// Can be any time format eg: mmHHss.

	/* Used in ConvertDateTimeToEpochTime class */
	String sourceFormatForEpoch = "yyyy-MM-ddHH:mm:ss";
	String timeZone = "Etc/UTC";
	String dateTimeValue = "2017-01-0121:02:30";

	/* Used in ConvertFromEpochTimeToDateTime class */
	String destinationFormatFromEpoch = "MM-yyyy-ddHH:mm:ss";
	Long epochTime = 0L;
}
