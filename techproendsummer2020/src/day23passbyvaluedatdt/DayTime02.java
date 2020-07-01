package day23passbyvaluedatdt;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class DayTime02 {

	public static void main(String[] args) {
		
		//How to update date format ==> 2020-06-30 --> 2020/06/30 --> 30-06-2020 --> 06$30$2020
		LocalDate date = LocalDate.now();
		System.out.println(date);//2020-06-30
		
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		dtf.format(date);
		System.out.println(dtf.format(date));//  30/06/2020
		
		DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("dd/MMM/yyyy");
		dtf1.format(date);
		System.out.println(dtf1.format(date));//  30/Jun/2020
		
		//if you use MMMM, Java prints the full names of the months
		DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("dd/MMMM/yyyy");
		dtf2.format(date);
		System.out.println(dtf2.format(date));// 30/June/2020
		
		
		//How to update time format
		
		LocalTime time = LocalTime.now();
		 
		//If you use lower case "h"s, Java uses 12 hours system (AM/PM)
		DateTimeFormatter dtf3 = DateTimeFormatter.ofPattern("hh:mm");
		dtf3.format(time);
		System.out.println(dtf3.format(time));//06:43
		
		//If you use upper case "H"s, Java uses 24 hours system (No AM/PM)
		DateTimeFormatter dtf4 = DateTimeFormatter.ofPattern("HH:mm");
		dtf4.format(time);
		System.out.println(dtf4.format(time));//18:46
		
		
		DateTimeFormatter dtf5 = DateTimeFormatter.ofPattern("hh:mm");
		dtf5.format(time);
		System.out.println(dtf5.format(time.plusHours(3)));//09:48
		
		DateTimeFormatter dtf6 = DateTimeFormatter.ofPattern("HH:mm");
		dtf6.format(time);
		System.out.println(dtf6.format(time.plusHours(3)));//21:48
		
		
		
		
		//How to get local time
		LocalTime.now(ZoneId.of("Turkey"));
		System.out.println(LocalTime.now(ZoneId.of("Turkey")));//19:52:58.615
		LocalTime.now(ZoneId.of("Japan"));
		System.out.println(LocalTime.now(ZoneId.of("Japan")));//01:52:58.616
		LocalTime.now(ZoneId.of("Europe/Moscow"));
		System.out.println(LocalTime.now(ZoneId.of("Europe/Moscow")));//18:52:58.617
				
		
	}

}







