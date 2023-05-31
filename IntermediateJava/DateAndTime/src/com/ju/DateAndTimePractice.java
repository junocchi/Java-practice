package com.ju;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.GregorianCalendar;

public class DateAndTimePractice {

	public static void main(String[] args) {
		//1.yyyy-MM-dd
		LocalDate localDate=LocalDate.now();
		System.out.println(localDate);
		
		//2.to transform a string in localDate
		localDate=LocalDate.parse("2023-05-03");
		System.out.println(localDate);
		
		//3.to choose any patter of data formatting
		localDate=LocalDate.parse("05/03/2021",DateTimeFormatter.ofPattern("MM/dd/yyyy"));
		System.out.println("Localdate : "+localDate);
		
		//4.to convert localDate to string
		String isoDate=localDate.toString();
		System.out.println(isoDate);
		
		//5.to format patter of localDate to string
		String formatter=localDate.format(DateTimeFormatter.ofPattern("MM=dd=yyyy"));
		System.out.println(formatter);
		
		//6.to subtract days from localDate
		LocalDate pastDate=localDate.minusDays(10);
		System.out.println(pastDate);//2021-04-23
		
		//7.to calculate the period between two dates
		Period difference =pastDate.until(localDate);
		System.out.println(difference);//P10D

		//8.to calculate the period in months
		LocalDate pastMonth=localDate.minusMonths(3);
		difference=pastMonth.until(localDate);
		System.out.println(difference);//P3M
		
		//9.
		LocalDateTime localDateTime=LocalDateTime.now();
		System.out.println(localDateTime);

		String formatted=localDateTime.format(DateTimeFormatter.ofPattern("yyyy-MM-dd hh:mm:ss"));
		System.out.println(formatted);
		
		Date legacyDate=new Date();
		
		System.out.println(legacyDate);
		
		GregorianCalendar legacyCalender=new GregorianCalendar();
		System.out.println(legacyCalender);
		//Converting GregorianCalnder date to LocalDate
		ZonedDateTime zonedDateTime=legacyCalender.toZonedDateTime();
		LocalDate localDate2=zonedDateTime.toLocalDate();
		System.out.println(localDate2);
		
	}

}
